Feature: OrangeHRM Home Page

  Background:
    Given Browser is launched
    And User login "https://sphelele101-trials711.orangehrmlive.com/auth/login" page is open
    Then Verify user login page is open

  @SmokeTest
  Scenario Outline: Testing OrangeHRM Home page
    When Users enters <username> and <password>
    And Click on login button
    Then verify user logged in successfully
    And Close the browser

    Examples:
      | username | password   |
      | Admin    | Nok2lasphe |
