package selenideTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.GoogleCloudPage;
import pages.GoogleCloudPricingCalculatorPage;
import pages.SearchResultPage;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class GoogleCulcTests {
    protected WebDriver driver;

    @Test
    public void search_selenide_in_google() throws InterruptedException {
        /* new GoogleCloudPage(driver)
                .openPageWithSelenide()
                .searchingWithSelenide("Google Cloud Platform Pricing Calculator");

        new SearchResultPage(driver).selectLinkToPricingCalculatorWithSelenide();
        new GoogleCloudPricingCalculatorPage(driver)
                .loadPageWithSelenide()
                .enterNumberOfInstancesWithSelenide("4")
                .selectSeriesWithSelenide("N1");
        Thread.sleep(6000);
*/
       open("https://cloud.google.com/");
        $(By.xpath("//input[@aria-label='Search']")).val("Google Cloud Platform Pricing Calculator").pressEnter();
        $(byText("Google Cloud Platform Pricing Calculator")).click();
        switchTo().frame($(By.xpath("//iframe[contains(@name, 'goog')]")));
        switchTo().frame($(By.tagName("iframe")));
        $(By.xpath("//input[@ng-model='listingCtrl.computeServer.quantity']")).val("4");
        $(By.xpath("//md-select-value[@id='select_value_label_59']//span[@class='md-select-icon']")).click();
        $$(By.xpath("//*[@class='md-select-menu-container md-active md-clickable']//md-option/div")).findBy(text("N1")).click();

       // $(By.name("q")).val("selenide").pressEnter();
       // $$("#res .g").shouldHave(sizeGreaterThan(1));
       // $("#res .g").shouldBe(visible).shouldHave(
        //        text("Selenide: concise UI tests in Java"),
          //      text("selenide.org"));
    }
}
