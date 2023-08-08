@Sales
Feature: Sales
  As a user bla bla bla

Scenario: User sort product cart
  Given User already on login page
  When User input "standard_user" as userName and input "secret_sauce" as password
  Then User already on product page
  When User sort product list by "Price (low to high)"
  And User click item "Sauce Labs Bike Light"
  And User click card badge
  Then Verify price