@Important
Feature: Create Account of Facebook12
  As a user u need to open facebook homepage and do the validations

@Smoke
  Scenario: Validate First Name field121
    Given User need to be on Facebook login page
   Then user clicks on new allesaccepteren button
    Then user clicks on new account button
    When User enters user "David" first name
    Then user checks user "David" firstname is present
    Then close browser

@Smoke @Regression   
   Scenario: Validate create user multiple fields2122
    Given User need to be on Facebook login page
   Then user clicks on new allesaccepteren button
    Then user clicks on new account button
    When User enters user "Ryan" first name
    And User enters user "Jack" surname
    Then user checks user "Ryan" firstname is present
    Then User mobile field should be blank
    Then close browser 
    
    Scenario: Validate First Name field3123
    Given User need to be on Facebook login page
   Then user clicks on new allesaccepteren button
    Then user clicks on new account button
    When User enters user "David" first name
    Then user checks user "David" firstname is present
    Then close browser
  
  @Regression    
    Scenario: Validate First Name field4124
    Given User need to be on Facebook login page
   Then user clicks on new allesaccepteren button
    Then user clicks on new account button
    When User enters user "David" first name
    Then user checks user "David" firstname is present
    Then close browser
    
 @Smoke   
    Scenario: Validate First Name field5125
    Given User need to be on Facebook login page
   Then user clicks on new allesaccepteren button
    Then user clicks on new account button
    When User enters user "David" first name
    Then user checks user "David" firstname is present
    Then close browser