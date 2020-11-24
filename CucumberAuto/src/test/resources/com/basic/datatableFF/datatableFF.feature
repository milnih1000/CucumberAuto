Feature: Create Account of Facebook3
  As a user u need to open facebook homepage and do the validations

      
   Scenario: Validate create user multiple fields31
    Given User need to be on Facebook login page
    Then user clicks on new allesaccepteren button
    Then user clicks on new account button
    When Enter following data
    |userName  |UserSurname |Mobile|
    |Tom       |Hanks	  		|1234  | 
    |Jack      |Danial      |5678  |
     
    Then close browser    