package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SearchPage {

    WebDriver driver;

    By destinationInput = By.cssSelector("input[data-selenium='textInput']");
    By searchButton     = By.cssSelector("button[data-selenium='searchButton']");
    By firstSuggestion  = By.cssSelector("li[data-testid='autosuggest-item']");
    By checkInBox       = By.cssSelector("div[data-selenium='checkInBox']");
    By checkOutBox      = By.cssSelector("div[data-selenium='checkOutBox']");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getDestinationInput() {
        return driver.findElement(destinationInput);
    }

    public WebElement getSearchButton() {
        return driver.findElement(searchButton);
    }

    public WebElement getCheckInBox() {
        return driver.findElement(checkInBox);
    }

    public WebElement getCheckOutBox() {
        return driver.findElement(checkOutBox);
    }

    public List<WebElement> getSuggestions() {
        return driver.findElements(firstSuggestion);
    }
}
