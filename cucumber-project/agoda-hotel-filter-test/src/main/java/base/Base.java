package base;

import org.openqa.selenium.WebDriver;
import java.util.Properties;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Base {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver1) {
        driver = driver1;
    }

    private Properties loadProperties() throws Exception {
        Properties prop = new Properties();
        InputStream is = Base.class.getClassLoader().getResourceAsStream("data.properties");
        if (is == null) throw new FileNotFoundException("data.properties not found on classpath");
        prop.load(is);
        return prop;
    }

    public String getUrl() throws Exception {
        return loadProperties().getProperty("url");
    }

    public String getBrowser() throws Exception {
        return loadProperties().getProperty("browser");
    }

    public String getDestination() throws Exception {
        return loadProperties().getProperty("destination");
    }

    public String getCheckin() throws Exception {
        return loadProperties().getProperty("checkin");
    }

    public String getCheckout() throws Exception {
        return loadProperties().getProperty("checkout");
    }

    public String getPriceMin() throws Exception {
        return loadProperties().getProperty("priceMin");
    }

    public String getPriceMax() throws Exception {
        return loadProperties().getProperty("priceMax");
    }

    public String getEmail() throws Exception {
        return loadProperties().getProperty("agoda.email");
    }

    public String getPassword() throws Exception {
        return loadProperties().getProperty("agoda.password");
    }
}
