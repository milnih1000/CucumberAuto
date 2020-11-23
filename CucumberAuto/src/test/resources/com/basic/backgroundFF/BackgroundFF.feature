Feature: Create Account of Facebook1
  As a user u need to open facebook homepage and do the validations

  Background: comon login steps11
    Given User need to be on Facebook login page

  Scenario: Validate First Name field12
   # Then user clicks on new allesaccepteren button
    Then user clicks on new account button
    When User enters user "David" first name
    Then user checks user "David" firstname is present
    Then close browser

  Scenario: Validate create user multiple fields13
 #   Then user clicks on new allesaccepteren button
    Then user clicks on new account button
    When User enters user "Ryan" first name
    And User enters user "Jack" surname
    Then user checks user "Ryan" firstname is present
    Then User mobile field should be blank
    Then close browser
