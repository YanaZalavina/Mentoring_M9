package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import service.BrowserSelector;

public class DriverSingleton {

   private static WebDriver driver;

   //change it to use properties
    private static String FIRST_NODE = "http://192.168.100.7:5557/wd/hub";
    private static String SECOND_NODE = "http://192.168.100.7:5558/wd/hub";
    public static final String BROWSER_NAME = "browser.name";
    private final Logger logger = LogManager.getRootLogger();

    private DriverSingleton(){}


    public static WebDriver getDriver() {
        if (null == driver) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            /*
            //switch (System.getProperty("browser")){
                switch (BrowserSelector.getBrowserName(BROWSER_NAME)){
                case "firefox": {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                 // driver = new FirefoxCreator().createWebDriver(driver);

                   /* FirefoxOptions options = new FirefoxOptions();
                    options.setCapability("platform", "WIN10");
                    options.setCapability("platformName", "windows");
                    driver = new RemoteWebDriver(new URL(SECOND_NODE), options);
                   break;
                }
                default: {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                   //driver = new ChromeCreator().createWebDriver(driver);

                    /*ChromeOptions options = new ChromeOptions();
                    options.setCapability("platform", "WIN10");
                    options.setCapability("platformName", "windows");
                    driver = new RemoteWebDriver(new URL(FIRST_NODE), options);
                    break;
                }
        }*/
            driver.manage().window().maximize();
        }
        return driver;
    }

  public static void closeDriver(){
        if(!(null==driver)){
            driver.quit();
            driver = null;
        }

    }
}
