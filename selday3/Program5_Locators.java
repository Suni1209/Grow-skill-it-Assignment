package selday3;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5_Locators {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("input#input_text")).sendKeys("JAVA");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Sel")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("text-primary-hover"))
        .sendKeys("PYTHON");
	}

}
