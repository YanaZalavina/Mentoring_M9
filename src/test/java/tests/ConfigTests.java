package tests;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import utils.TestListener;

@Listeners({TestListener.class})
public class ConfigTests {

    protected WebDriver driver;

    @BeforeMethod(alwaysRun = true)
        public void browserSetUp() {
        driver = DriverSingleton.getDriver();
    }

   @AfterMethod(alwaysRun = true)
    public void browserQuit(){
        DriverSingleton.closeDriver();
    }
}
