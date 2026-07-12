package selday2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1_DatePicker {

    public static void main(String[] args) throws Exception {

        ChromeDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.oyorooms.com/");

        Thread.sleep(3000);

        driver.findElement(
            By.xpath("//div[contains(@class,'datePickerDesktop__home')]")
        ).click();

        Thread.sleep(3000);

        WebElement arrow = driver.findElement(
            By.xpath("//div[contains(@class,'PaginationArrow--next')]")
        );

        arrow.click();
        Thread.sleep(2000);

        arrow.click();
        Thread.sleep(2000);

        arrow.click();
        Thread.sleep(2000);

        // Check-in Date
        driver.findElement(
            By.xpath("//span[@class='DateRangePicker_DateLabel' and text()='10']")
        ).click();

        Thread.sleep(2000);

        // Check-out Date
        driver.findElement(
            By.xpath("(//span[@class='DateRangePicker_DateLabel' and text()='5'])[2]")
        ).click();

        Thread.sleep(3000);

        driver.quit();
    }
}