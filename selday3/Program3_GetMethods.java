package selday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Program3_GetMethods {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.engineerdiaries.com/selenium");
		System.out.println(driver.getTitle());
		Thread.sleep(8000);
		WebElement inputBox=driver.findElement(By.id("input_text"));
		System.out.println(inputBox.getAccessibleName());
		System.out.println(inputBox.getAriaRole());
		System.out.println(inputBox.getAttribute("placeholder"));
		System.out.println(inputBox.getCssValue("front-size"));
		System.out.println(inputBox.getDomAttribute("value"));
		System.out.println(inputBox.getDomProperty("text"));
		System.out.println(inputBox.getTagName());
		System.out.println(inputBox.isDisplayed());
		System.out.println(inputBox.isEnabled());
		System.out.println(inputBox.isSelected());
		System.out.println(inputBox.getLocation().getX());
		System.out.println(inputBox.getRect().getHeight());
		

	}

}
