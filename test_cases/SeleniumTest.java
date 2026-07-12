package test_cases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTest {
	ChromeDriver driver;
	@BeforeMethod
	void setUp() throws Exception
	{
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	@AfterMethod
	void tearDown() throws Exception
	{
		Thread.sleep(2000);
		driver.quit();
	}
	@Test
	void methodA()
	{
		driver.get("https://www.engineerdiaries.com/selenium");
	}
	@Test
	void methodB()
	{
		driver.get("https://www.geeksforgeeks.org/");
	}

}
