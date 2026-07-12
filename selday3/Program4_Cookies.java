package selday3;

import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class Program4_Cookies {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.geeksforgeeks.org");
		Thread.sleep(8000);
		Cookie c1=new Cookie("keyA","valueA");
		driver.manage().addCookie(c1);
		Set<Cookie>cookies=driver.manage().getCookies();
		for(Cookie c:cookies) 
		{
			System.out.println(c.getName()+":"+c.getValue());
		}
		driver.manage().deleteCookie(c1);
		driver.manage().deleteCookieNamed("gfg_theme");
		
		System.out.println("**********");
		cookies=driver.manage().getCookies();
		for(Cookie c:cookies) 
		{
			System.out.println(c.getName()+":"+c.getValue());
		}

	}

}
