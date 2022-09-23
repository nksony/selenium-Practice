Feature: Feature to test Google search functionality

  Scenario: Validate Google serch functionality is working
    Given Browser is open
    And User is on Google search page
    When User enter a text on search box
    And hits enter button
    Then User is navigate to search result
