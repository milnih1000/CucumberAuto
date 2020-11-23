Feature: Create Account of Facebook9
  As a user u need to open facebook homepage and do the validations

  Scenario: Validate First Name field91
    Given User need to be on Facebook login page
  # Then user clicks on new allesaccepteren button
    Then user clicks on new account button
    When User enters user first name
    Then user checks user firstname is present
    Then close browser
    
   Scenario: Validate create user multiple fields92
    Given User need to be on Facebook login page
   # Then user clicks on new allesaccepteren button
    Then user clicks on new account button
    When User enters user first name
    And User enters user surname
    Then user checks user firstname is present
    Then User mobile field should be blank
    Then close browser