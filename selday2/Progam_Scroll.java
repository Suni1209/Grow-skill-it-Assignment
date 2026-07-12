package selday2;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
public class Progam_Scroll{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(3000);
		List<WebElement>tdList=driver.findElements(By.xpath("//td//a"));
		List<String>list=new ArrayList<>();
		for(int i=1;i<=tdList.size();i++) 
		{
			WebElement td=driver.findElement(By.xpath("//td//a["+i+"]"));
			String name=driver.findElement(By.xpath("//tr["+(i+1)+"]//td[2]")).getText();
			System.out.println("name:"+name);
			String id=td.getText();
			int reportId=Integer.parseInt(id);
			System.out.println("reportId:reportId");
			td.click();
			List<WebElement>rows=driver.findElements(By.xpath("//tr"));
			int sum=0;
			for(int j=2;j<=rows.size();j++) 
			{
				WebElement td2=driver.findElement(By.xpath("//tr)["+j+"]//td[3]"));
				
				String id2=td2.getText();
				int rowValue=Integer.parseInt(id2);
				sum=sum+rowValue;
			}
			if(sum!=reportId)
				list.add(name);
			System.out.println("sum:"+sum);
			Thread.sleep(2000);
			driver.navigate().back();
		}
		System.out.println(list);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		
	}
}

	


