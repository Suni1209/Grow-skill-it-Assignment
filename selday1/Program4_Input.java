package selday1;

import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4_Input {
	public static void main(String[] args)throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://www.engineerdiaries.com/selenium");
		Thread.sleep(2000);
		
		//WebElement inputBox=driver.findElement(By.id("input_text"));
		//inputBox.clear();
		//Thread.sleep(2000);
		//inputBox.sendKeys("java");
		//Thread.sleep(2000);
		
    //  List<WebElement>genderList=driver.findElements(By.name("gender"));
	 // genderList.get(1).click();
		
		List<WebElement>checkList=driver.findElements(By.name("progrmmingLand"));
		for(WebElement box:checkList)
		{
			box.click();
			Thread.sleep(2000);
		}
		WebElement inputBox=driver.findElement(By.id("input_text"));
		inputBox.clear();
		inputBox.sendKeys("java");
		Thread.sleep(2000);
		
		List<WebElement>genderList=driver.findElements(By.name("gender"));
		genderList.get(1).click();
		driver.quit();
		
		
		
		
		
		
		
		
	  
	  
	  
	  
	
	
		

	}

}
