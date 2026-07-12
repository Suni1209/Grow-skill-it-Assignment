package selday1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
public class Program2_Navigate {

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);;
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(2000);
		driver.get("https://www.geeksforgeeks.org/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		

	}

}
