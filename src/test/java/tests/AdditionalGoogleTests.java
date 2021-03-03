package tests;

import model.GoogleCloud;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GoogleCloudPage;
import pages.GoogleCloudPricingCalculatorPage;
import pages.SearchResultPage;
import service.GoogleCloudCreator;
import utils.AdditionalMethods;

public class AdditionalGoogleTests extends ConfigTests {

    @Test(groups = {"functional"})
    public void checkDeleteEstimate() {
        GoogleCloud testCloud = GoogleCloudCreator.withAllCOrrectDatas();
        new GoogleCloudPage(driver)
                .openPage()
                .enterValueForSearching("Google Cloud Platform Pricing Calculator")
                .pressEnter();

        new SearchResultPage(driver).selectLinkToPricingCalculator();
        new GoogleCloudPricingCalculatorPage(driver)
                .loadPage()
                .enterNumberOfInstances(testCloud.getNumberOfInstances())
                .selectSeries(testCloud.getSeries())
                .selectMachineType(testCloud.getMachineType())
                .activateCheckBoxAddGPUs()
                .enterNumberOfGPUs(testCloud.getNumberOfGPUs())
                .selectGPUType(testCloud.getGPUType())
                .selectLocalSSD(testCloud.getLocalSSD())
                .selectDatacenterLocation(testCloud.getDatacenterLocation())
                .selectCommittedUsage("1 Year")
                .clickOnAddToEstimate()
                .clickOnDeleteEstimateButton();
        Assert.assertEquals(new GoogleCloudPricingCalculatorPage(driver).countNumberOfElementsEstimateResults(), 0);
    }

    @Test(groups = {"functional"})
    public void checkFormComputerEngine() {
        new GoogleCloudPage(driver)
                .openPage()
                .enterValueForSearching("Google Cloud Platform Pricing Calculator")
                .pressEnter();
        new SearchResultPage(driver).selectLinkToPricingCalculator();
        Assert.assertTrue(
                new GoogleCloudPricingCalculatorPage(driver)
                .loadPage()
                .elementLocatedOnPage("Machine Class"));
    }
    /*
    @Test(groups = {"functional"})
    public void checkDeleteEstimate() {
        new GoogleCloudPage(driver)
                .openPage()
                .enterValueForSearching("Google Cloud Platform Pricing Calculator")
                .pressEnter();

        new SearchResultPage(driver).selectLinkToPricingCalculator();
        new GoogleCloudPricingCalculatorPage(driver)
                .loadPage()
                .enterNumberOfInstances("4")
                .selectSeries("N1")
                .selectMachineType("n1-standard-8")
                .activateCheckBoxAddGPUs()
                .enterNumberOfGPUs("1")
                .selectGPUType("NVIDIA Tesla V100")
                .selectLocalSSD("2x375 GB")
                .selectDatacenterLocation("Frankfurt")
                .selectCommittedUsage("1 Year")
                .clickOnAddToEstimate()
                .clickOnDeleteEstimateButton();
        Assert.assertEquals(new GoogleCloudPricingCalculatorPage(driver).countNumberOfElementsEstimateResults(), 0);
    }*/

    @Test(groups = {"functional"})
    public void checkURLOfPageGoogleCloudPricingCalculator() {
        new GoogleCloudPage(driver)
                .openPage()
                .enterValueForSearching("Google Cloud Platform Pricing Calculator")
                .pressEnter();
        new SearchResultPage(driver).selectLinkToPricingCalculator();
        new GoogleCloudPricingCalculatorPage(driver)
                .loadPage();
        Assert.assertEquals(new GoogleCloudPricingCalculatorPage(driver).getURL(), "https://cloudpricingcalculator.appspot.com/");
    }

    @Test (groups = {"functional"})
    public void checkActualData() {
        new GoogleCloudPage(driver)
                .openPage()
                .enterValueForSearching("Google Cloud Platform Pricing Calculator")
                .pressEnter();
        new SearchResultPage(driver).selectLinkToPricingCalculator();
        String dateOnGooglePage = new GoogleCloudPricingCalculatorPage(driver)
                        .loadPage()
                        .getWebElementText("Last update");
        Assert.assertTrue(dateOnGooglePage.contains(new AdditionalMethods().getCurrentDateMonthYear()));
    }

}
