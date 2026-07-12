package selday1;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
public class gprogram_Grid {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions=new ChromeOptions();
		chromeOptions.setCapability("platformName","Windows");
		WebDriver driver=new RemoteWebDriver (new URL("http://localhost:4444"),chromeOptions);
				driver.get("https://www.engineerdiaries.com/selenium");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		//Actions act=new Actions(driver);
		
		//for(int i=1;i<=5;i++)
		//	act.scrollByAmount(0,300).pause(2000).build().perform();
				

	}

}
