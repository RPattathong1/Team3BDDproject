@CodingDashboard
Feature: Coding dashboard page tests

  Background: Login to homepage
    When  User enters following credentials:
  | Enter Username | test@yahoo.com |
  | Enter Password | test123        |
    And User clicks on "Login" button
    And User clicks on "Coding" button

  Scenario: Verify user is able to edit the question
    When User clicks on "Enter new question" button
    And User enter question in text box
    And User clicks on "Enter" button
    And User clicks on edit icon
    And  User edits question
    And  User clicks on check mark
    Then  Verify edited question is correct

  Scenario: Verify user is able to delete the question
    When  User clicks on delete icon
    Then  Verify question was deleted

