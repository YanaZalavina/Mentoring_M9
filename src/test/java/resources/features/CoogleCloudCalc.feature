Feature: As a user I want to check Delete Estimate button

  Background: User open GoogleCloudPricingCalculator page
    Given the user open GoogleSearching page
    When the user enter ValueForSearching "Google Cloud Platform Pricing Calculator"
    And the user press Enter
    And the user select LinkToPricingCalculator
    And GoogleCloudPricingCalculator page load
    Then page with url "https://cloudpricingcalculator.appspot.com/" is opened

  @regression
  Scenario: User open GoogleCloudPricingCalculator page
  Given the user enter Number Of Instances "4"
  When the user select Series "N1"
  And the user select MachineType "n1-standard-8"
  And the user activate CheckBox AddGPUs
  And the user enter Number Of GPUs "1"
  And the user select GPU Type "NVIDIA Tesla V100"
  And the user select LocalSSD "2x375 GB"
  And the user select Datacenter Location "Frankfurt"
  And the user select CommittedUsage "1 Year"
  And the user click On AddToEstimate
  And the user click On DeleteEstimate Button
    Then there is no saved estimate