package driver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class DecoratorRunner {
    public static void main(String[] args) {
        WebDriver driver = null;
        BaseDriverCreator decorator = new FirefoxCreator(new ChromeCreator());
        decorator.createWebDriver(driver);
    }

}
