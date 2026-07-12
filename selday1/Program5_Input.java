package selday1;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class Program5_Input {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(7000);
		
		driver.findElement(By.tagName("textarea")).sendKeys("today is monday");
		
		WebElement countryTag=driver.findElement(By.id("country"));
		Select dropdown=new Select(countryTag);
		dropdown.selectByVisibleText("Russia");
		Thread.sleep(2000);
		dropdown.selectByValue("china");
		Thread.sleep(2000);
		dropdown.selectByIndex(12);
		Thread.sleep(2000);
		driver.findElement(By.id("date")).sendKeys("01-04-2025");
		Thread.sleep(2000);
		
		
	}
}
		
		