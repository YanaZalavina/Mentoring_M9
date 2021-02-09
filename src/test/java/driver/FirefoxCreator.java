package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxCreator extends BaseDriverCreator {

    public FirefoxCreator(WebDriverCreator creator){
        super(creator);
    };

    public FirefoxCreator(){
        super();
    };



    @Override
    public WebDriver createWebDriver(WebDriver driver) {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        Dimension dim = creator==null ? getDimension() : creator.getDimension();
        driver.manage().window().setSize(dim);
        return driver;
    }

    @Override
    public Dimension getDimension() {
        return new Dimension(11, 20);
    }
}
