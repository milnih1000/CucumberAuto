Feature: Create Account of Facebook2
  As a user u need to open facebook homepage and do the validations

    
   Scenario Outline: Validate create user multiple fields21
    Given User need to be on Facebook login page
    Then user clicks on new allesaccepteren button
    Then user clicks on new account button
    When User enters user "<user>" first name
    And User enters user "<surname>" surname
    Then user checks user "<user>" firstname is present
    Then User mobile field should be blank
    Then close browser
    Examples:
     |	user	 |	surname	|
     |	Tom	   |	Jerry	  |
     |	Laurel |	hardy 	|
     
     