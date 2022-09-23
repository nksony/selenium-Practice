
Feature: Test login functionality

  
  Scenario Outline: Check login is successful with valid credentials
    Given Browser is open
    And   user is on login page
    When  user enter the <username> and<password>
    And   user click on login botton 
    Then  user is navigated to login page

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
