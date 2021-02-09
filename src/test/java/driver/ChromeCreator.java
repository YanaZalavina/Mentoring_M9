package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeCreator extends BaseDriverCreator {
    public ChromeCreator(WebDriverCreator creator){
        super(creator);
    };
    public ChromeCreator(){
        super();
    };

    @Override
    public WebDriver createWebDriver(WebDriver driver) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        Dimension dim = creator==null ? getDimension() : creator.getDimension();
        driver.manage().window().setSize(dim);
        return driver;
    }

    @Override
    public Dimension getDimension() {
        return new Dimension(20, 20);
    }
}
