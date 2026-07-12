package selday3;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
public class Program2_ScreenShot {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.geeksforgeeks.org");
		Thread.sleep(3000);
		File src=driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./screenshot.JPG"));

	}

}
