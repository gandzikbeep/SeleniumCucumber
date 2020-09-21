Feature: Automation Practice Logo

  Scenario: Logo presence on homepage
    Given I launch chrome browser
    When I open Automation Practice homepage
    Then I verify that the logo present on page
    And close browser

