Feature: OrangeHRM Home Page

  Background:
    Given Browser is launched
    And User login "https://sphelele101-trials711.orangehrmlive.com/auth/login" page is open
    Then Validate user login page
    When User enters "Admin" and "Nok2lasphe"
    Then User Click on Login button

  @SmokeTest
  Scenario: Testing OrangeHRM Home page
    Then verify Home Page is open
    And Close the browser
