package selday2;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4_Alert {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.engineerdiaries.com/selenium");
		Thread.sleep(2000);
		driver.findElement(By.id("alert")).click();
		Thread.sleep(2000);
		Alert alertWin=driver.switchTo().alert();
		System.out.println(alertWin.getText());
		alertWin.accept();
		
		Thread.sleep(2000);
		driver.findElement(By.id("confirm")).click();
		Thread.sleep(2000);
		Alert confirmWin=driver.switchTo().alert();
		System.out.println(confirmWin.getText());
		confirmWin.dismiss();
		
		Thread.sleep(2000);
		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		Alert promptWin=driver.switchTo().alert();
		System.out.println(promptWin.getText());
		Thread.sleep(2000);
		promptWin.sendKeys("java");
		promptWin.accept();
		
		

	}

}
