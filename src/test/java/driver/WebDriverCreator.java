package driver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public interface WebDriverCreator {
    WebDriver createWebDriver(WebDriver driver);

    Dimension getDimension();
}
