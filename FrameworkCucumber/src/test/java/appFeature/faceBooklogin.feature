 Feature: Test login functionality of facebook page
 
 Scenario: Check ogin functionality with valid credentials
    Given Browser is open
    And User is on facebook login page
    When User enter valid username and password
    And user click on login  button
    Then User is navigate to facebook home page 
 
