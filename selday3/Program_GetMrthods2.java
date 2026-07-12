package selday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Program_GetMrthods2 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.engineerdiaries.com/selenium");
		System.out.println(driver.getTitle());
		Thread.sleep(8000);
		By python=RelativeLocator.with(By.xpath("//input[@value='python']"))
				.toRightOf(By.xpath("//input[@value='java']"));
		driver.findElement(python).click();

	}

}
