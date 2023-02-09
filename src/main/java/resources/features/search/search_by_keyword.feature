Feature: MADA QA Dashboard Application
  Scenario: Login with valid credentials
    Given User is on Dashboard Lading page
    When User enter the Valid User name
    When User enter the  valid password
    And User click on Login button
    Then User Navigate to HomePage
