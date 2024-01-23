Feature: OrangeHRM login Page

  Background:
    Given Browser is launched
    And User login "https://sphelele101-trials711.orangehrmlive.com/auth/login" page is open
    Then Verify user login page is open

  @SmokeTest
  Scenario Outline: Testing if User can login successfully
    When Users enters <username> and <password>
    And Click on login button
    Then verify user logged in successfully
    And Close the browser
    Examples:
      | username | password   |
      | Admin    | Nok2lasphe |

  @SmokeTest
  Scenario Outline: Testing if user enters invalid credentials
    When Users enters <username> and <password>
    And Click on login button
    Then verify user entered invalid credentials
    And Close the browser
    Examples:
      | username | password  |
      | Admi     | Nok2lsphe |