@OrangeHRMSLogin
Feature: OrangeHRMS Login feature
  @HRMSLogin
  Scenario: Login with valid credential
    Given Open the login page
    When Enter user name in user text box
    And Enter password in password text box
    And I click on submit button
    Then I verify the user dashboard
