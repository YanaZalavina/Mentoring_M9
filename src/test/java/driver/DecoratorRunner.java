package driver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class DecoratorRunner {
    BaseDriverCreator decorator = new ChromeCreator(new FirefoxCreator());
}
