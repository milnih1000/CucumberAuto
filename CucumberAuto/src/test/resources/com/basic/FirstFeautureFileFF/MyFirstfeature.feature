Feature: Create Account of Facebook4
  As a user u need to open facebook homepage and do the validations

  Scenario: Validate First Name field41
    Given User need to be on Facebook login page
    When User enters user first name
    Then user checks user firstname is present
    Then close browser