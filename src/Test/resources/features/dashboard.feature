Feature: User-default-Dashboard page tests

  Background: Navigate to page
    When User enters following credentials:
      | Enter Username | test@yahoo.com |
      | Enter Password | test123      |
    And User clicks on "Login" button

  @regression @smoke
  Scenario: Verify all buttons are displayed using Cucumber Data Table
    Then Verify following buttons are displayed:
      | All Topics |
      | Coding |
      | Soft skills |


