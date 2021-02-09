package cucumber.test;

import driver.DriverSingleton;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class CucumberHook {
    protected WebDriver driver;
    @Before
    public void browserSetUp() {
        driver = DriverSingleton.getDriver();
    }
    @After
    public void browserQuit(){
        DriverSingleton.closeDriver();
    }
}
