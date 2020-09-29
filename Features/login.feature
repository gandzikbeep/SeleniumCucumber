

Feature: Feature to test login functionality

  Scenario: Check login is successful with valid credentials

    Given user is on login page
    When user log in with username and password
    Then user is navigated to the welcome page
