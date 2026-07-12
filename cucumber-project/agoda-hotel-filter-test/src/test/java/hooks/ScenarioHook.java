package hooks;

import base.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.ByteArrayInputStream;
import java.time.Duration;

public class ScenarioHook extends Base {

    @Before
    public void setup() {
        try {
            String browser = this.getBrowser();
            WebDriver driver;

            if (browser.equals("chrome")) {
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--remote-allow-origins=*");
                options.addArguments("--disable-gpu");
                options.addArguments("--start-maximized");
                driver = new ChromeDriver(options);
            } else {
                EdgeOptions options = new EdgeOptions();
                options.addArguments("--no-sandbox");
                options.addArguments("--start-maximized");
                driver = new EdgeDriver(options);
            }

            setDriver(driver);
            getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        try {
            byte[] screenshot = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(screenshot));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (getDriver() != null) {
                getDriver().quit();
            }
        }
    }
}
