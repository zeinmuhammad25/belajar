@CheckOut
  Feature: Feature check out
    description feature

    Scenario: User purchases 2 items until the order is successful
      Given User open the website sauce demo
      When User input "standard_user" as userName and input "secret_sauce" as password
      Then User already on landing page
      And User sort product list by name z to a
      And User click new item