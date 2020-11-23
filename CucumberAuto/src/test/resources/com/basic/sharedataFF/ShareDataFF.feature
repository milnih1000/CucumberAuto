Feature: Create Account of Facebook11
  As a user u need to open facebook homepage and do the validations

  Scenario: Validate First Name field111
    Given User need to be on Facebook login page
   # Then user clicks on new allesaccepteren button
    Then user clicks on new account button
    When User enters user "David" first name
    Then user checks user "David" firstname is present

  Scenario: Validate create user multiple fields112
    Given User need to be on Facebook login page
   # Then user clicks on new allesaccepteren button
    Then user clicks on new account button
    When User enters user "Ryan" first name
    And User enters user "Jack" surname
    Then user checks user "Ryan" firstname is present
    Then User mobile field should be blank
