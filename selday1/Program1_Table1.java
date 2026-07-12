package selday1;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program1_Table1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(2000);
		List<WebElement>headingList= driver.findElements(By.xpath("//tr//th"));
		for(WebElement heading:headingList) 
		{
			System.out.print(heading.getText()+" ");
		}
		
		System.out.println();
		List<WebElement>row5= driver.findElements(By.xpath("//tr[@data-testid='row-5']//td"));
		System.out.println(row5.size());
		for(int i=1;i<=row5.size()-1;i++)
		{
			//WebElement elements=
			System.out.print(row5.get(i).getText()+" ");
		}
		System.out.println();
		for(int i=2;i<=row5.size();i++)
			
		{
			WebElement element=driver.findElement(By.xpath("//tr[@data-testid='row-5']//td["+i+"]"));
			System.out.println(element.getText()+" ");
		}
		
		

	}

}
