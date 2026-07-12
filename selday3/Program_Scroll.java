package selday3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_Scroll {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(2000);
		JavascriptExecutor js=driver;
		js.executeScript("window.scrollBy(0,2000)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		

	}

}
