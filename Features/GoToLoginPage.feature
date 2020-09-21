Feature: Go to Login Page

  Scenario: Login Page is opened
    Given Launch chrome browser
    When Open Automation Practice homepage
    When I open LoginPage
    Then I verify that input email is present
    And close browser2