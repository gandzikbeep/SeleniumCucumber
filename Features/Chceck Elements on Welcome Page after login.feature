Feature: Check Elements on Welcome Page after login


  Background:
    Given user is on login page


  Scenario Outline:
    When user enters <username> and <password>
    Then user is navigated to the welcome page
    Then user see My Wishlist button


    Examples:
      | username              | password |
      | correctUsername@pl.pl | 1234567  |
