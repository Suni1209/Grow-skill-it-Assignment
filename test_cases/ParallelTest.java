package test_cases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	

	@Test
	void methodA() throws Exception
	{
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(2000);
		driver.quit();
		
	}
	@Test
	void methodB() throws Exception
	{
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.geeksforgeeks.org/");
		Thread.sleep(2000);
		driver.quit();
		
	}

}
