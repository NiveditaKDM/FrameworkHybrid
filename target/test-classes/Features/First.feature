Feature: This feature tests the signup functionality of the ijmeet application

  Background: 
    Given Chrome Browser should be open

  Scenario: Verify if application accepts blank full name
    Given Chrome Browser should be open
    When User leaves full name empty and clicks in signup button
    Then User should see an error message

  Scenario: Type number as first name and check if sysytem accepts it
    Given User is on Signup page
    When User enters the full name as "Nivedita"
