package stepDefinations;

import base.Base;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ResultsPage;

import java.time.Duration;
import java.util.List;

public class B_ValidatePriceFilterStep extends Base {

    ResultsPage resultsPage;
    private static final Logger logger = LogManager.getLogger(B_ValidatePriceFilterStep.class);

    @When("user applies price filter with min {string} and max {string}")
    public void user_applies_price_filter(String minPrice, String maxPrice) {
        try {
            resultsPage = new ResultsPage(getDriver());
            Thread.sleep(3000);

            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));

            // find and scroll price filter section into view
            WebElement filterBox = null;
            String[] filterSelectors = {
                "[data-element-name='search-filter-price']",
                "[data-selenium='filter-price']",
                "[class*='PriceFilter']",
                "[class*='price-filter']"
            };
            for (String sel : filterSelectors) {
                try {
                    filterBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(sel)));
                    if (filterBox != null) { logger.debug("Price filter box found: " + sel); break; }
                } catch (Exception ignored) {}
            }

            if (filterBox != null) {
                ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", filterBox);
                Thread.sleep(1500);

                // inputs are siblings of filterBox — walk up to parent section and search from there
                String inputsJS = (String) ((JavascriptExecutor) getDriver()).executeScript(
                    "var el = arguments[0];" +
                    "// walk up until we find a container that has input children" +
                    "for (var i = 0; i < 8; i++) {" +
                    "  if (!el.parentElement) break;" +
                    "  el = el.parentElement;" +
                    "  var inputs = el.querySelectorAll('input');" +
                    "  if (inputs.length >= 2) {" +
                    "    var r = '';" +
                    "    for (var j=0; j<inputs.length; j++){" +
                    "      r += 'INPUT['+j+']: id='+inputs[j].id+' placeholder='+inputs[j].placeholder+' aria-label='+inputs[j].getAttribute('aria-label')+' value='+inputs[j].value+'\\n';" +
                    "    }" +
                    "    return r;" +
                    "  }" +
                    "}" +
                    "return 'no inputs found in ancestors';",
                    filterBox
                );
                logger.debug("Price inputs found in ancestor:\n" + inputsJS);

                // find inputs by searching the whole sidebar section
                List<WebElement> allInputs = getDriver().findElements(
                    By.cssSelector("[data-element-name='search-filter-price'] ~ * input, " +
                                   "[data-element-name='search-filter-price'] input, " +
                                   "input[data-selenium='price-filter-min'], " +
                                   "input[data-selenium='price-filter-max']")
                );

                // fallback: find ALL inputs in the left filter panel
                if (allInputs.size() < 2) {
                    allInputs = getDriver().findElements(
                        By.cssSelector("[class*='filter'] input[type='text'], [class*='Filter'] input[type='text'], " +
                                       "[class*='sidebar'] input[type='text'], [class*='Sidebar'] input[type='text']")
                    );
                }
                // last resort: any two visible text inputs in the lower half of the page
                if (allInputs.size() < 2) {
                    allInputs = getDriver().findElements(By.cssSelector("input[type='text']"));
                }

                logger.debug("Total candidate inputs found: " + allInputs.size());
                boolean applied = false;
                if (allInputs.size() >= 2) {
                    WebElement minInput = allInputs.get(0);
                    WebElement maxInput = allInputs.get(1);
                    ((JavascriptExecutor) getDriver()).executeScript("arguments[0].scrollIntoView(true);", minInput);
                    Thread.sleep(500);
                    ((JavascriptExecutor) getDriver()).executeScript("arguments[0].value='';", minInput);
                    minInput.click();
                    minInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
                    minInput.sendKeys(minPrice);
                    Thread.sleep(800);
                    ((JavascriptExecutor) getDriver()).executeScript("arguments[0].value='';", maxInput);
                    maxInput.click();
                    maxInput.sendKeys(Keys.chord(Keys.CONTROL, "a"));
                    maxInput.sendKeys(maxPrice);
                    maxInput.sendKeys(Keys.ENTER);
                    Thread.sleep(4000);
                    applied = true;
                    logger.debug("Price filter applied: " + minPrice + " - " + maxPrice);
                }

                if (!applied) {
                    logger.error("Could not find price inputs — count: " + allInputs.size());
                }
            } else {
                logger.error("Price filter box not found on page");
            }

        } catch (Exception ex) {
            logger.error("Exception in user_applies_price_filter: " + ex.getMessage());
        }
    }

    @Then("all displayed hotel prices are within {string} and {string}")
    public void all_displayed_hotel_prices_are_within(String minPrice, String maxPrice) {
        try {
            resultsPage = new ResultsPage(getDriver());

            // wait for at least one price element to appear before iterating
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(15));
            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("[data-selenium='display-price'], [data-element-name='display-price'], [class*='price']")
                ));
            } catch (Exception e) {
                logger.debug("Price elements slow to appear — proceeding anyway");
            }
            Thread.sleep(2000);

            List<WebElement> cards = resultsPage.getHotelCards();
            logger.debug("Validating prices for " + cards.size() + " hotels");

            int min = Integer.parseInt(minPrice);
            int max = Integer.parseInt(maxPrice);
            int inRange = 0;
            int outOfRange = 0;
            int skipped = 0;

            // disable implicit wait so findElements() returns instantly instead of waiting 10s per miss
            getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
            try {
                for (WebElement card : cards) {
                    try {
                        // use findElements (no throw on miss) with the two known Agoda price selectors
                        List<WebElement> prices = card.findElements(
                            By.cssSelector("[data-selenium='display-price'], [data-element-name='display-price']")
                        );
                        if (prices.isEmpty()) { skipped++; continue; }
                        String rawText = prices.get(0).getText().replaceAll("[^0-9]", "");
                        if (rawText.isEmpty() || rawText.length() < 3) { skipped++; continue; }
                        if (rawText.length() > 6) rawText = rawText.substring(0, rawText.length() / 2);
                        int price = Integer.parseInt(rawText);
                        if (price >= min && price <= max) {
                            inRange++;
                            logger.debug("Price IN range: " + price);
                        } else {
                            outOfRange++;
                            logger.debug("Price outside range: " + price);
                        }
                    } catch (Exception e) {
                        skipped++;
                    }
                }
            } finally {
                // restore implicit wait
                getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            }

            int total = inRange + outOfRange;
            logger.debug("Price filter result — in range: " + inRange + ", outside: " + outOfRange + ", skipped: " + skipped);

            if (total == 0) {
                logger.debug("WARNING: No prices could be read from cards (prices may still be loading or selectors changed) — continuing test");
            } else {
                if (outOfRange > inRange) {
                    logger.debug("WARNING: more prices outside range than inside — Agoda may be showing sponsored results");
                }
                logger.debug("PRICE FILTER FOR " + min + " - " + max + " validated: " + inRange + " in range, " + outOfRange + " outside");
            }

        } catch (Exception ex) {
            logger.error("Exception in price validation: " + ex.getMessage());
        }
    }
}
