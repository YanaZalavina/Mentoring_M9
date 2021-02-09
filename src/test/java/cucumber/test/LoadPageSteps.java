package cucumber.test;
import driver.DriverSingleton;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.GoogleCloudPage;
import pages.GoogleCloudPricingCalculatorPage;
import pages.SearchResultPage;

public class LoadPageSteps {

    private GoogleCloudPage googleCloudPage = new GoogleCloudPage(DriverSingleton.getDriver());
    private SearchResultPage searchResultPage = new SearchResultPage(DriverSingleton.getDriver());
    private GoogleCloudPricingCalculatorPage googleCloudPricingCalculatorPage = new GoogleCloudPricingCalculatorPage(DriverSingleton.getDriver());

    @When("^the user open GoogleSearching page$")
    public void openGoogleSearchingPage() {
        googleCloudPage.openPage();
    }

    @When("^the user enter ValueForSearching \"([^\"]*)\"$")
    public void enterValueForSearching(String valueForSearching) {
        googleCloudPage.enterValueForSearching(valueForSearching);
    }

    @When("^the user press Enter$")
    public void pressEnter() {
        googleCloudPage.pressEnter();
    }

    @When("^the user select LinkToPricingCalculator$")
    public void theUserSelectLinkToPricingCalculator() {
        searchResultPage.selectLinkToPricingCalculator();
    }

    @When("^GoogleCloudPricingCalculator page load$")
    public void googlecloudpricingcalculatorPageLoad() {
        googleCloudPricingCalculatorPage.loadPage();
    }

    @Then("^page with url \"([^\"]*)\" is opened$")
    public void pageWithUrlIsOpened(String url) {
        Assert.assertEquals(googleCloudPricingCalculatorPage.getURL(), url);
    }

    @When("the user enter Number Of Instances {string}")
    public void enterNumberOfInstances(String numberOfInstances) {
        googleCloudPricingCalculatorPage.enterNumberOfInstances(numberOfInstances);
    }

    @When("the user select Series {string}")
    public void selectSeries(String serie) {
        googleCloudPricingCalculatorPage.selectSeries(serie);
    }



    @When("the user select MachineType {string}")
    public void selectMachineType(String machineType) {
        googleCloudPricingCalculatorPage.selectMachineType(machineType);
    }

    @When("the user activate CheckBox AddGPUs")
    public void activateCheckBoxAddGPUs() {
        googleCloudPricingCalculatorPage.activateCheckBoxAddGPUs();
    }

    @When("the user enter Number Of GPUs {string}")
    public void enterNumberOfGPUs(String numberOfGPUs) {
        googleCloudPricingCalculatorPage.enterNumberOfGPUs(numberOfGPUs);
    }

    @When("the user select GPU Type {string}")
    public void selectGPUType(String GPUType) {
        googleCloudPricingCalculatorPage.selectGPUType(GPUType);
    }

    @When("the user select LocalSSD {string}")
    public void selectLocalSSD(String localSSD) {
        googleCloudPricingCalculatorPage.selectLocalSSD(localSSD);
    }

    @When("the user select Datacenter Location {string}")
    public void selectDatacenterLocation(String datacenterLocation) {
        googleCloudPricingCalculatorPage.selectDatacenterLocation(datacenterLocation);
    }

    @When("the user select CommittedUsage {string}")
    public void selectCommittedUsage(String committedUsage) {
        googleCloudPricingCalculatorPage.selectCommittedUsage(committedUsage);
    }

    @When("the user click On AddToEstimate")
    public void clickOnAddToEstimate() {
        googleCloudPricingCalculatorPage.clickOnAddToEstimate();
    }

    @When("the user click On DeleteEstimate Button")
    public void clickOnDeleteEstimateButton() {
        googleCloudPricingCalculatorPage.clickOnDeleteEstimateButton();
    }

    @Then("there is no saved estimate")
    public void checkIsNotSavedEstimate() {
        Assert.assertEquals(googleCloudPricingCalculatorPage.countNumberOfElementsEstimateResults(), 0);
    }
}
