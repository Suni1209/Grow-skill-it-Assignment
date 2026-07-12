package selday3;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2_Shadow_Dom {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(2000);
		SearchContext root =driver.findElement(By.xpath("//div[@data-testid='shadow-host']")).getShadowRoot();
		WebElement p=root.findElement(By.cssSelector("div>p"));
		System.out.println(p.getText());
		
		
		

	}

	
		
	}


