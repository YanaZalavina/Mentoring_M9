package pages;

import com.codeborne.selenide.SelenideElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.codeborne.selenide.Selenide.$;

public class SearchResultPage extends AbstractPage{

    private final Logger logger = LogManager.getRootLogger();

    public SearchResultPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a/b[text()='Google Cloud Platform Pricing Calculator']")
    private WebElement linkToPricingCalculator;
    @FindBy(xpath = "//div[@class='gsc-results gsc-webResult']")
    private WebElement areaWithListSearchResults;

    public SearchResultPage selectLinkToPricingCalculator(){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(areaWithListSearchResults));
        linkToPricingCalculator.click();
        logger.info("Selected Link To Pricing Calculator");
        return this;
    }
/*
    //fields for using Selenide
    private SelenideElement linkToPricingCalculatorSD = $(By.xpath("//a/b[text()='Google Cloud Platform Pricing Calculator']"));

    //methods for using Selenide
    public SearchResultPage selectLinkToPricingCalculatorWithSelenide(){
        linkToPricingCalculatorSD.click();
        //logger.info("Selected Link To Pricing Calculator");
        return this;
    }
     */
}
