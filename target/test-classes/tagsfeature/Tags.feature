@Important
Feature:Create account of Facebook12
  As a user u need to open facebook home page and do the validations

  @Smoke
  Scenario : Validate First name field1121
    Given User should be on facebook login page
    When User enters user "David" first name
    Then User checks user "David" first name is present
    Then close browser


  @Smoke @Regression
  Scenario: Validate create user multiple fields2122
    Given  User need to be on Facebook login page
    When  User enters user "Ryan" first name
    And User enters user "Jack" surname
    Then User checks user"Ryan" first name is present
    Then User Mobile field should be blank
    Then close browser



  Scenario : Validate First name field3123
    Given User should be on facebook login page
    When User enters user "David" first name
    Then User checks user "David" first name is present
    Then close browser


  @Regression
  Scenario : Validate First name field4124
    Given User should be on facebook login page
    When User enters user "David" first name
    Then User checks user "David" first name is present
    Then close browser

  @Smoke
  Scenario : Validate First name field5125
    Given User should be on facebook login page
    When User enters user "David" first name
    Then User checks user "David" first name is present
    Then close browser

