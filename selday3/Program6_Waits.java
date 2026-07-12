package selday3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program6_Waits {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().
		pageLoadTimeout(Duration.ofSeconds(10));	
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		System.out.println(driver.getTitle());
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(100));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("input_text"))
		.sendKeys("hello");
		wait.until
		(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='input_text']")))
		.sendKeys("**HELLO");
	}

}
