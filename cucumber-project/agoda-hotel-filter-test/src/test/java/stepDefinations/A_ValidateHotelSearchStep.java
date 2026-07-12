package stepDefinations;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.SearchPage;

import java.time.Duration;
import java.util.List;

public class A_ValidateHotelSearchStep extends Base {

    SearchPage searchPage;
    private static final Logger logger = LogManager.getLogger(A_ValidateHotelSearchStep.class);

    @Given("user is on agoda home page")
    public void user_is_on_agoda_home_page() {
        try {
            Thread.sleep(2000);
            getDriver().get(this.getUrl());
            getDriver().manage().window().maximize();
            Thread.sleep(4000);

            // retry once if page didn't load properly
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(
                    By.cssSelector("input[data-selenium='textInput']")
                ));
            } catch (Exception e) {
                logger.debug("Page slow to load — refreshing");
                Thread.sleep(3000);
                getDriver().navigate().refresh();
                Thread.sleep(5000);
                new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(
                    ExpectedConditions.presenceOfElementLocated(
                        By.cssSelector("input[data-selenium='textInput']")
                    )
                );
            }

            // dismiss any popup or cookie banner
            String[] closeSelectors = {
                "button[aria-label='Close']",
                "button[data-element-name='close-button']",
                "[data-testid='close-button']",
                "[class*='modal'] button[class*='close']",
                "[class*='Modal'] button[class*='close']",
                "button[id*='close']",
                "[aria-label='close' i]"
            };
            for (String sel : closeSelectors) {
                try {
                    WebElement popup = getDriver().findElement(By.cssSelector(sel));
                    if (popup.isDisplayed()) {
                        popup.click();
                        Thread.sleep(1000);
                        logger.debug("Dismissed popup with: " + sel);
                        break;
                    }
                } catch (Exception ignored) {}
            }

            logger.debug("Navigated to Agoda home page");
        } catch (Exception ex) {
            logger.error("Exception in user_is_on_agoda_home_page: " + ex.getMessage());
        }
    }

    @When("user enters destination {string} and selects it from suggestions")
    public void user_enters_destination_and_selects_from_suggestions(String destination) {
        try {
            searchPage = new SearchPage(getDriver());
            Thread.sleep(2000);
            WebElement input = searchPage.getDestinationInput();
            input.clear();
            input.sendKeys(destination);
            Thread.sleep(3000);
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
            List<WebElement> suggestions = wait.until(
                ExpectedConditions.numberOfElementsToBeMoreThan(
                    By.cssSelector("li[data-testid='autosuggest-item']"), 0
                )
            );
            suggestions.get(0).click();
            logger.debug("Destination selected: " + destination);
            Thread.sleep(2000);
        } catch (Exception ex) {
            logger.error("Exception in user_enters_destination: " + ex.getMessage());
        }
    }

    @When("user clicks the search button")
    public void user_clicks_the_search_button() {
        try {
            // Agoda auto-opens date picker after destination — close it first
            Thread.sleep(2000);
            getDriver().findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
            Thread.sleep(1500);

            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
            WebElement searchBtn = null;
            String[] selectors = {
                "button[data-element-name='search-button']",
                "button[data-selenium='searchButton']",
                "button[class*='search-button']",
                "//button[contains(text(),'Search')]",
                "//button[contains(text(),'SEARCH')]"
            };
            for (String sel : selectors) {
                try {
                    if (sel.startsWith("//")) {
                        searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sel)));
                    } else {
                        searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(sel)));
                    }
                    if (searchBtn != null) { logger.debug("Search button found: " + sel); break; }
                } catch (Exception ignored) {}
            }

            if (searchBtn != null) {
                searchBtn.click();
                logger.debug("Search button clicked");
                Thread.sleep(6000);
            } else {
                logger.error("Search button not found");
            }
        } catch (Exception ex) {
            logger.error("Exception in user_clicks_the_search_button: " + ex.getMessage());
        }
    }

    @Then("hotel results are displayed")
    public void hotel_results_are_displayed() {
        try {
            WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(25));
            String[] cardSelectors = {
                "[data-selenium='hotel-item']",
                "[data-element-name='property-card']",
                "li[data-hotelid]",
                "[class*='PropertyCard']"
            };
            List<WebElement> cards = null;
            for (String sel : cardSelectors) {
                try {
                    wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(sel)));
                    cards = getDriver().findElements(By.cssSelector(sel));
                    if (cards.size() > 0) {
                        logger.debug("Hotel cards found with selector: " + sel);
                        break;
                    }
                } catch (Exception ignored) {}
            }
            Assert.assertNotNull(cards, "No hotel results found");
            Assert.assertTrue(cards.size() > 0, "Hotel list is empty");
            logger.debug("Hotel results displayed: " + cards.size() + " hotels found");
        } catch (Exception ex) {
            logger.error("Exception in hotel_results_are_displayed: " + ex.getMessage());
        }
    }
}
