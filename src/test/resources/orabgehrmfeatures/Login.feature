Feature: Login Functinality
  Scenario: login with valid credentials
    Given user should be on login page
    When user enters "username"
    And user enters "password"
    And user clicks on login button
    Then user should redirect to Dashboard