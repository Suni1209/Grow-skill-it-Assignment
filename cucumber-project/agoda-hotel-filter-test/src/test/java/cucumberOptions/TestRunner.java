package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src//test//resources//features"},
    glue = {"stepDefinations", "hooks"},
    tags = "@hotelSearch or @priceFilter or @saveWishlist",
    plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber-report.json"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
