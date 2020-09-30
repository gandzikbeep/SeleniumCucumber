Feature: Multi-user login

  Scenario Outline:

    Given user is on login page
    When user enters <username> and <password>
    Then user is navigated to the welcome page

    Examples:
      | username              | password |
      | correctUsername@pl.pl | 1234567  |
      | anna@test.pl          | 111111   |
