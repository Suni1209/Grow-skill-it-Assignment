package selday2;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Program3_FRAME {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(5000);
		WebElement frameTag=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frameTag);
		driver.findElement(By.name("userName")).sendKeys("java");
		
		
		
		
			

	}

}
