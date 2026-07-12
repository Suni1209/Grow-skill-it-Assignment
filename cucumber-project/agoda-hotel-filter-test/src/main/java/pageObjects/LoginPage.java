package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;

    By signInBtn      = By.cssSelector("[data-element-name='sign-in-button'], [data-selenium='sign-in'], button[class*='signin'], a[href*='login'], a[href*='sign-in']");
    By emailInput     = By.cssSelector("input[type='email'], input[name='email'], input[id*='email' i], input[placeholder*='email' i]");
    By passwordInput  = By.cssSelector("input[type='password'], input[name='password'], input[id*='password' i]");
    By submitBtn      = By.cssSelector("button[type='submit'], button[data-selenium='submit'], [data-element-name='login-button']");
    By loggedInCheck  = By.cssSelector("[data-element-name='user-menu'], [data-selenium='user-menu'], [class*='userAvatar'], [class*='UserAvatar']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSignInBtn() {
        return driver.findElement(signInBtn);
    }

    public WebElement getEmailInput() {
        return driver.findElement(emailInput);
    }

    public WebElement getPasswordInput() {
        return driver.findElement(passwordInput);
    }

    public WebElement getSubmitBtn() {
        return driver.findElement(submitBtn);
    }

    public boolean isLoggedIn() {
        try {
            return driver.findElement(loggedInCheck).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
