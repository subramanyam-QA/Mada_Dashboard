Feature: MADA QA Dashboard Application
  Scenario: Login with valid credentials
    Given User is on Dashboard Lading page
    When User enter the Valid User name
    When User enter the  valid password
    And User click on Login button
    Then User Navigate to HomePage

#    Scenario:  Verify Active Link in Payer Summery page
#      Given User is on Homepage
#      When User click on payer summery page
#      Then User validate the payer summery URL
#      When User click on Active Links
#      Then User get Script Status is Active






