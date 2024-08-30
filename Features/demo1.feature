Feature: demo functionality test

  Scenario: Check login with valid credentials
    Given User is calculated by 1/0
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page
