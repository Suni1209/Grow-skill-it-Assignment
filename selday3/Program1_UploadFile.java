package selday3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1_UploadFile {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(2000);
		driver.findElement(By.id("file-upload"))
		.sendKeys("C:\\Users\\deepa\\OneDrive\\Desktop\\LogDependencyCode.txt");

	}

}
