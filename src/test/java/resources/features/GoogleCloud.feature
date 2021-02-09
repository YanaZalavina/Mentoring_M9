Feature: As a user I want to open GoogleCloudPricingCalculator page

@smoke
  Scenario Outline: User open GoogleCloudPricingCalculator page
    Given the user open GoogleSearching page
    When the user enter ValueForSearching "<ValueForSearching>"
    And the user press Enter
    And the user select LinkToPricingCalculator
    And GoogleCloudPricingCalculator page load
    Then page with url "https://cloudpricingcalculator.appspot.com/" is opened
  Examples:
    |ValueForSearching  |
    | Google Cloud Platform Pricing Calculator|
    | Google Cloud Platform Pricing Cal|