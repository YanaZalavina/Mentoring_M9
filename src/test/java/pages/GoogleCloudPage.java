package pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.AdditionalMethods;

import static com.codeborne.selenide.Selenide.*;

public class GoogleCloudPage extends AbstractPage{
    private static final String HOMEPAGE_URL = "https://cloud.google.com/";
    private final Logger logger = LogManager.getRootLogger();

    public GoogleCloudPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }


    @FindBy(xpath = "//input[@aria-label='Search']")
    private WebElement searchButton;

    public GoogleCloudPage openPage() {
        logger.info("Opened GoogleCloud Page");
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@aria-label='Search']")));
        return this;
    }

    public GoogleCloudPage enterValueForSearching(String valueForSearching){
        new AdditionalMethods().findAndClickOnElement(driver, searchButton);
        searchButton.sendKeys(valueForSearching);
        logger.info("Entered value for searching: " + valueForSearching);
        return this;
    }

    public GoogleCloudPage pressEnter(){
        searchButton.sendKeys(Keys.ENTER);
        logger.info("Pressed Enter");
        return this;
    }
    /*
    //fields for using Selenide
    private SelenideElement searchButtonSD = $(By.xpath("//input[@aria-label='Search']"));
    //methods for using Selenide
    public GoogleCloudPage openPageWithSelenide() {
       // logger.info("Opened GoogleCloud Page");
        open(HOMEPAGE_URL);
        return this;
    }

    public GoogleCloudPage searchingWithSelenide(String valueForSearching){
        searchButtonSD.val(valueForSearching).pressEnter();
       // logger.info("Entered value for searching: " + valueForSearching);
        return this;
    }
    */
}
