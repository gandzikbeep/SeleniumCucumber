#Author
# Date
# Description

Feature: Feature to test login functionality

  Scenario: Check login is successful with valid credentials

    Given user is on login page
    When user enters username
    And User enter a password
    And User click sigin btn
    Then user is navigated to the welcome page


#  Scenario Outline:
#
#    Given user is on login page
#    When user enters <username> and <password>
#    And click on login button
#    Then user is navigated to the welcome page
#
#    Examples:
#      | username              | password |
#      | correctUsername@pl.pl | 1234567  |
#      | anna@test.pl          | 111111   |




