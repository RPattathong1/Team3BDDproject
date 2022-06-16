@loginScenarios
Feature: Login page tests

  Scenario: Verify title of the page Interview App
    When User enters following credentials:
    | Enter Username | test@yahoo.com |
    | Enter Password | test123        |
    And User clicks on "Login" button
    Then Verify title of the page is "Interview App"


