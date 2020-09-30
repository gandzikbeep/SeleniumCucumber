Feature: Correct logout

  Scenario Outline:

    Given user is on login page
    When user enters <username> and <password>
    Then user is navigated to the welcome page
    And user logout



    Examples:
      | username              | password |
      | correctUsername@pl.pl | 1234567  |
