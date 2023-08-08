@Automation
Feature: Automation


  Scenario: Create sales
    When User input "standard_user" as userName and "secret_sauce" as a password
    And User click product "Backpack"
    And user click cart badge
    Then User verify price value