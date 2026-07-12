package selday3;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa
public class Program3_SpiceJet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions opt=new ChromeOptions();
		Map<String,Object>prefs=new HashMap<>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		opt.setExperimentalOption("prefs", prefs);
		ChromeDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.spicejet.com/");
		
		
		

	}

}
