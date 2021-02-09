package cucumber.test;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = "pretty",
        monochrome = true,
        tags = "@regression",
        glue = "cucumber.test",
        features = "src/test/java/resources/features"
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}
