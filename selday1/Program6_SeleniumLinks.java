package selday1;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Program6_SeleniumLinks {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000); 
		driver.manage().window().maximize();
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(5000);
		List<WebElement>links=driver.findElements(By.xpath("//footer//a"));
		for(WebElement link:links)
		{
			try {
				HttpURLConnection conn=(HttpURLConnection) new URL(link.getAttribute("href")).openConnection();
				conn.setRequestMethod("GET");
				if(conn.getResponseCode()==404)
					System.out.println(link.getAttribute("href")+":link is not working");
				else
					System.out.println(link.getAttribute("href")+":link is working");
			}
			catch(Exception ex)
			{
			}
		}
		
		}
	}
		
	

	


