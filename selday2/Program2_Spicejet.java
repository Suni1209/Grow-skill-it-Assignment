package selday2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program2_Spicejet {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.spicejet.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[text()='Form']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*text()='Form']/following::input"))
		.sendKeys("hyd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='To']/following::input"))
		.sendKeys("pun");

	}

}
