package tests;

import utils.AdditionalMethods;

public class GoogleCloudPlatformPricingCalculatorTest extends ConfigTests {

    AdditionalMethods tabs = new AdditionalMethods();

/*
    @Test(dataProvider = "valuesCheckEnteredValues", groups = "regression")
    public void checkEnteredDataForPricingCalculator(String visibleNameOfWebElement, String expectedValue) {
        new GoogleCloudPage(driver)
                .openPage()
                .enterValueForSearching("Google Cloud Platform Pricing Calculator")
                .pressEnter();

        new SearchResultPage(driver).selectLinkToPricingCalculator();

        String visibleName =
                new GoogleCloudPricingCalculator(driver)
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
                .getWebElementText(visibleNameOfWebElement);
        Assert.assertEquals(visibleName, expectedValue);
    }

    @DataProvider(name = "valuesCheckEnteredValues")
    public Object[][] valuesForCosOperations(){
        return new Object[][]{
                {"VM class", "VM class: regular"},
                {"Instance type", "Instance type: n1-standard-8"},
                {"Region: Frankfurt", "Region: Frankfurt"},
                {"Total available local SSD space", "Total available local SSD space 2x375 GiB"},
                {"Commitment term", "Commitment term: 1 Year"}
        };
    }

     @Test(groups = {"functional"})
    public void checkCostForPricingCalculatorPerOneMonth() {
        new GoogleCloudPage(driver)
                .openPage()
                .enterValueForSearching("Google Cloud Platform Pricing Calculator")
                .pressEnter();

        new SearchResultPage(driver).selectLinkToPricingCalculator();

        String visibleName = new GoogleCloudPricingCalculator(driver)
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
                .getWebElementText("Estimated Component Cost");
        Assert.assertEquals(visibleName, "Estimated Component Cost: USD 1,082.77 per 1 month");

    }

    @Test(groups = {"functional"})
    public void checkCostForPricingCalculatorPerOneMonthInEmail() {
        new GoogleCloudPage(driver)
                .openPage()
                .enterValueForSearching("Google Cloud Platform Pricing Calculator")
                .pressEnter();

        new SearchResultPage(driver).selectLinkToPricingCalculator();

        String estimateCost = new GoogleCloudPricingCalculator(driver)
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
                .getWebElementText("Estimated Component Cost");
        new GoogleCloudPricingCalculator(driver).
                openNewTab();
        tabs.saveOpenedTabsAndSwitchToSelected(driver, 1);
        new TempMailPage(driver)
                .openPage()
                .loadPage()
                .clickOnIconForCopyTempEmail();
        tabs.saveOpenedTabsAndSwitchToSelected(driver, 0);
        new GoogleCloudPricingCalculator(driver)
                .loadPage()
                .clickOnEmailEstimateButton()
                .enterCopiedEmail()
                .clickOnSendEmailButton();
        tabs.saveOpenedTabsAndSwitchToSelected(driver, 1);

        String estimateCostFromMail = new TempMailPage(driver)
                .loadPage()
                .clickOnheaderEmailInTempService()
                .getTextAboutCostFromGoogleEmail();

        Assert.assertTrue(estimateCost.contains(estimateCostFromMail));
    }
    */
}
