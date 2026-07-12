package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ResultsPage {

    WebDriver driver;

    // multiple fallback selectors — Agoda varies by session/region
    By hotelCards      = By.cssSelector("[data-selenium='hotel-item'], [data-element-name='property-card'], li[data-hotelid]");
    By hotelName       = By.cssSelector("[data-selenium='hotel-name'], [data-element-name='property-name'], h3[class*='hotel-name']");
    By hotelPrice      = By.cssSelector("[data-selenium='display-price'], [data-element-name='display-price']");
    By wishlistButton  = By.cssSelector("[data-element-name='wishlist-button'], button[aria-label*='wishlist' i], button[aria-label*='Save' i]");
    By priceFilterMin  = By.cssSelector("input[data-selenium='price-filter-min'], input[placeholder*='Min' i], input[name*='min' i]");
    By priceFilterMax  = By.cssSelector("input[data-selenium='price-filter-max'], input[placeholder*='Max' i], input[name*='max' i]");
    By priceFilterBox  = By.cssSelector("[data-element-name='search-filter-price'], [data-selenium='filter-price'], [class*='price-filter']");

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getHotelCards() {
        return driver.findElements(hotelCards);
    }

    public WebElement getHotelName(WebElement card) {
        return card.findElement(hotelName);
    }

    public WebElement getHotelPrice(WebElement card) {
        return card.findElement(hotelPrice);
    }

    public WebElement getWishlistButton(WebElement card) {
        return card.findElement(wishlistButton);
    }

    public WebElement getPriceFilterMin() {
        return driver.findElement(priceFilterMin);
    }

    public WebElement getPriceFilterMax() {
        return driver.findElement(priceFilterMax);
    }

    public WebElement getPriceFilterBox() {
        return driver.findElement(priceFilterBox);
    }
}
