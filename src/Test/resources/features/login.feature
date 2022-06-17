Feature: Login page tests

  Background: Navigate to page
    Given User opens "User-Mgt" page
    When User opens "Login" page
    And User switches to new window

  Scenario: Verify title of the page
    When User switches to new window
    Then Verifies title of the page is "Login Page"

  Scenario: Verify user will see Student portal name when signed in as a student
    When User enters following credentials:
      | Enter Username | jwick@gmail.com |
      | Enter Password | john.wick$      |
    And User clicks on "Login" button
    Then Verify h1 "Student Portal" header is displayed