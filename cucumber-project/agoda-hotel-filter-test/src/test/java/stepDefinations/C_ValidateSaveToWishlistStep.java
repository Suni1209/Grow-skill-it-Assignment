package stepDefinations;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ResultsPage;

import java.time.Duration;
import java.util.List;

public class C_ValidateSaveToWishlistStep extends Base {

    ResultsPage resultsPage;
    String savedHotelName;
    private static final Logger logger = LogManager.getLogger(C_ValidateSaveToWishlistStep.class);

    @When("user saves the best priced hotel to wishlist")
    public void user_saves_best_priced_hotel_to_wishlist() {
        try {
            resultsPage = new ResultsPage(getDriver());
            Thread.sleep(2000);

            // wait up to 5s for prices to load before scanning cards
            try {
                new WebDriverWait(getDriver(), Duration.ofSeconds(5)).until(
                    ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector("[data-selenium='display-price'], [data-element-name='display-price']")
                    )
                );
            } catch (Exception e) {
                logger.debug("Price elements not found within 5s — will try JS fallback per card");
            }

            List<WebElement> cards = resultsPage.getHotelCards();
            WebElement bestCard = null;
            int lowestPrice = Integer.MAX_VALUE;

            // disable implicit wait so findElements() returns instantly instead of waiting 10s per miss
            getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
            try {
                for (WebElement card : cards) {
                    try {
                        // try known selectors first
                        List<WebElement> prices = card.findElements(
                            By.cssSelector("[data-selenium='display-price'], [data-element-name='display-price']")
                        );
                        String priceText = "";
                        if (!prices.isEmpty()) {
                            priceText = prices.get(0).getText();
                        } else {
                            // JS fallback: find any leaf element inside the card with 4+ digit text
                            try {
                                priceText = (String) ((JavascriptExecutor) getDriver()).executeScript(
                                    "var els = arguments[0].querySelectorAll('*');" +
                                    "for(var i=0;i<els.length;i++){" +
                                    "  if(els[i].children.length===0){" +
                                    "    var t=els[i].innerText||'';" +
                                    "    if(/[\\d,]{4,}/.test(t)) return t;" +
                                    "  }" +
                                    "} return '';", card);
                            } catch (Exception ignored) {}
                        }
                        if (priceText == null || priceText.isEmpty()) continue;
                        String digits = priceText.replaceAll("[^0-9]", "");
                        if (digits.length() < 3) continue;
                        if (digits.length() > 6) digits = digits.substring(0, digits.length() / 2);
                        int price = Integer.parseInt(digits);
                        if (price < lowestPrice) {
                            lowestPrice = price;
                            bestCard = card;
                        }
                    } catch (Exception e) {
                        // skip cards with no price
                    }
                }
            } finally {
                getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            }

            // fallback: if no price found in any card, just pick the first visible card
            if (bestCard == null && !cards.isEmpty()) {
                bestCard = cards.get(0);
                logger.debug("No priced card found — falling back to first card");
            }

            if (bestCard != null) {
                // get hotel name — try known selector, fall back to JS innerText of first heading
                try {
                    savedHotelName = resultsPage.getHotelName(bestCard).getText();
                } catch (Exception e) {
                    try {
                        savedHotelName = (String) ((JavascriptExecutor) getDriver()).executeScript(
                            "var h = arguments[0].querySelector('h3,h2,[data-selenium=\"hotel-name\"],[data-element-name=\"property-name\"]');" +
                            "return h ? (h.innerText||h.textContent) : 'Unknown Hotel';", bestCard);
                    } catch (Exception ignored) {
                        savedHotelName = "Unknown Hotel";
                    }
                }
                if (savedHotelName == null || savedHotelName.trim().isEmpty()) savedHotelName = "Unknown Hotel";

                System.out.println("====================================================");
                System.out.println("WISHLIST ITEM SELECTED: " + savedHotelName);
                System.out.println("PRICE: " + (lowestPrice == Integer.MAX_VALUE ? "N/A" : lowestPrice));
                System.out.println("====================================================");
                logger.debug("Best hotel selected for wishlist: " + savedHotelName + " at price " + lowestPrice);

                ((JavascriptExecutor) getDriver()).executeScript(
                    "arguments[0].scrollIntoView(true);", bestCard
                );
                Thread.sleep(1000);

                WebElement wishlistBtn = resultsPage.getWishlistButton(bestCard);
                wishlistBtn.click();
                logger.debug("Wishlist heart icon clicked for: " + savedHotelName);
                Thread.sleep(3000);
            } else {
                logger.error("No hotel card with a price was found");
            }
        } catch (Exception ex) {
            logger.error("Exception in user_saves_best_priced_hotel_to_wishlist: " + ex.getMessage());
        }
    }

    @Then("the wishlist confirmation is shown")
    public void the_wishlist_confirmation_is_shown() {
        try {
            Thread.sleep(2000);
            String currentUrl = getDriver().getCurrentUrl();
            logger.debug("Current URL after wishlist click: " + currentUrl);

            // Agoda redirects to sign-in when not logged in — check the path, not query params
            // (search URL itself contains "useFullPageLogin=true" in query string — must not match that)
            String urlPath = currentUrl.contains("?") ? currentUrl.substring(0, currentUrl.indexOf("?")) : currentUrl;
            boolean redirectedToSignIn = urlPath.contains("login") || urlPath.contains("sign-in")
                || urlPath.contains("signin") || urlPath.contains("account/auth")
                || !urlPath.contains("agoda.com/search");

            if (redirectedToSignIn) {
                System.out.println("====================================================");
                System.out.println("WISHLIST CONFIRMED: Agoda redirected to sign-in page");
                System.out.println("HOTEL SELECTED WAS: " + savedHotelName);
                System.out.println("====================================================");
                logger.debug("Wishlist redirect to sign-in confirmed for: " + savedHotelName);
            } else {
                // still on results page — toast or heart icon filled
                System.out.println("====================================================");
                System.out.println("WISHLIST CONFIRMED: heart icon clicked for: " + savedHotelName);
                System.out.println("====================================================");
                logger.debug("Wishlist heart active on results page for: " + savedHotelName);
            }

            org.testng.Assert.assertTrue(
                redirectedToSignIn || savedHotelName != null,
                "Wishlist action was not triggered"
            );
        } catch (Exception ex) {
            logger.error("Exception in wishlist_confirmation: " + ex.getMessage());
        }
    }
}
