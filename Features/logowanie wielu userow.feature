Feature: Multi-user login with logout

  Scenario Outline:

    Given user is on login page
    When user enters <username> and <password>
    Then user is navigated to the welcome page
    And user logout




    Examples:
      | username              | password |
      | correctUsername@pl.pl | 1234567  |
#      | anna@test.pl          | 111111   |
#      | abc@xyz.com           | Test@123 |    // incorrectData
