package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.AdditionalMethods;
import static waits.Waits.waitToBeClickableForElement;
import static waits.Waits.waitToBeVisibleForElement;

public class TempMailPage extends AbstractPage{
    private static final String TEMP_EMAIL_SERVICE_URL = "https://10minutemail.com/";
    private final Logger logger = LogManager.getRootLogger();

    public TempMailPage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//span[@class='copy_icon']")
    private WebElement iconForCopyTempEmail;
    @FindBy(xpath = "//div[@class='mail_address']")
    private WebElement tempEmail;
    @FindBy(xpath = "//span[@id='inbox_count_number']")
    private WebElement labelCountOfEmailInTempService;
    @FindBy(xpath = "//span[contains(text(), 'Google Cloud Platform Price Estimate')]")
    private WebElement headerEmailInTempService;
    @FindBy(xpath = "//h3[text()='Total Estimated Monthly Cost']/../following-sibling::td/h3")
    private WebElement labelEstimateCostInEmail;
    @FindBy(xpath = "//div[@class='adsbyvli']")
    private WebElement adsBlock;

    public TempMailPage loadPage(){
        PageFactory.initElements(driver, this);
        waitToBeVisibleForElement(driver, adsBlock);
        logger.info("Loaded TempMail Page");
        return this;
    }
    public TempMailPage openPage() {
        driver.get(TEMP_EMAIL_SERVICE_URL);
        logger.info("Opened TempMail Page");
        return this;
    }

    public TempMailPage clickOnIconForCopyTempEmail(){
        waitToBeClickableForElement(driver, tempEmail);
        waitToBeClickableForElement(driver, adsBlock);
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='copy_icon']")));
        new AdditionalMethods().findAndClickOnElement(driver, iconForCopyTempEmail);
        iconForCopyTempEmail.click();
        logger.info("Copied temp email");
        return this;
    }

    public TempMailPage clickOnheaderEmailInTempService(){
        new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElement(labelCountOfEmailInTempService, "1"));
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(headerEmailInTempService));
        new AdditionalMethods().findAndClickOnElement(driver, headerEmailInTempService);
        logger.info("Opened email in TempService");
        return this;
    }

    public String getTextAboutCostFromGoogleEmail(){
        waitToBeClickableForElement(driver, labelEstimateCostInEmail);
        logger.info("Got text about cost from Google Email");
        return labelEstimateCostInEmail.getText().trim();
    }
}
