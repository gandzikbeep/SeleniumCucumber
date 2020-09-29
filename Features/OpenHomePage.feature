Feature: OpenHomePage

  Background:
    Given Open homepage

  Scenario: Logo presence on homepage
    Then I verify that the logo present on page
    Then SignIn button is visible on homePage
    And Close browser





