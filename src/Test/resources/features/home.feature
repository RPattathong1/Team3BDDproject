@HomeScenarios

Feature: Homepage related scenarios

  Background: Navigate to Interview Prep Homepage
    When User enters following credentials:
      | Enter Username | test@yahoo.com |
      | Enter Password | test123        |
    And User clicks on "Login" button

  @IN-2
  Scenario: Verify user only see "Sign out" button from nav bar
    Then Verify "Sign out" link is displayed


  @IN-2
  Scenario: Verify user does not have access to "Manage Access" button
    Then Verify "Manage Access" link is not displayed
