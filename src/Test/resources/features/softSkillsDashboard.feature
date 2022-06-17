Feature: Dashboard page tests

  Background:
    Given User clicks on "Soft skills" button

  Scenario: Verify user is able to edit the question
    When : User clicks on edit icon
    And : User edits question
    And : User clicks on check mark
    Then : Verify question display is correct

  Scenario: Verify user is able to delete the question
    When : User clicks on delete icon
    Then : Verify question was deleted