package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AdditionalMethods {

    private static String commonXPathForElementsFromDropdownList = "//*[@class='md-select-menu-container md-active md-clickable']//md-option/div";

    public AdditionalMethods findAndClickOnElementFromDropDownList(WebDriver driver, String visibleNameOfWebElement){
        List<WebElement> options = driver.findElements(By.xpath(commonXPathForElementsFromDropdownList));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        for (int i=0; i<options.size(); i++) {
            if(options.get(i).getText().contains(visibleNameOfWebElement)) {
                js.executeScript("arguments[0].click();", options.get(i));
                break;
            }
        }
        return this;
    }

    public AdditionalMethods findAndClickOnElement(WebDriver driver, WebElement element){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
        return this;
    }

    public String getCurrentDateMonthYear(){
        LocalDate now = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");
        return now.format(formatter);
    }

    public AdditionalMethods saveOpenedTabsAndSwitchToSelected(WebDriver driver, int indexOfWindow){
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(indexOfWindow));
        return this;
    }
}
