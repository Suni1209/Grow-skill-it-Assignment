package selday3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.interactions.Actions;

public class Program1_Actions {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(5000);
		WebElement hover=
		driver.findElement(By.xpath("//*[@data-testid='hover-box']"));
		Actions act=new Actions(driver);
		act.moveToElement(hover).build().perform();
		
		Thread.sleep(2000);
		WebElement rightClick=
		driver.findElement(By.xpath("//*[@data-testid='right-click-box']"));
		act.contextClick(rightClick).build().perform();
		
		Thread.sleep(2000);
		WebElement dblClick=
		driver.findElement(By.xpath("//*[@data-testid='double-click-box']"));
		act.doubleClick(dblClick).build().perform();
		
		Thread.sleep(2000);
		WebElement dragElement=driver.findElement(By.id("draggable"));
		WebElement dropElement=driver.findElement(By.xpath("//*[contains(text(),'Drop here')]"));
		act.dragAndDrop(dragElement,dropElement).build().perform();
		Thread.sleep(2000);
		WebElement inputBox=driver.findElement(By.id("input_text"));
		act.scrollToElement(driver.findElement(By.xpath("//*[text()='Start']")));
		Thread.sleep(4000);
		act.keyDown(Keys.SHIFT).build().perform();
		inputBox.clear();
		Thread.sleep(1000);
		inputBox.sendKeys("h");
		act.keyUp(Keys.SHIFT).build().perform();
		inputBox.sendKeys("ello");
		
		
		
		

	}

}
