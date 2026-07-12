package selday2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2_nestedFrame {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(2000);
		WebElement outerFrame=driver.findElement(By.id("outer"));
		driver.switchTo().frame(outerFrame);
		WebElement innerFrame=driver.findElement(By.id("inner"));
		driver.switchTo().frame(innerFrame);
		driver.findElement(By.id("input2")).sendKeys("INNER");
		driver.switchTo().parentFrame();
		Thread.sleep(2000);
		driver.findElement(By.id("input1")).sendKeys("OUTER");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@value='java']")).click();
		
		
		
		
		

	}

}
