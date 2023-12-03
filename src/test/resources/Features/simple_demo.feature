@LoginFeature
Feature: Logn features
#Tagging start with @
  @regression
  Scenario: Login with valid credentail
    Given open the browser
    And i pass the valid credential
    When i click on login button
    Then i direct to the user dashboard

    @regression @sanity
  Scenario: Login with valid In credentail
    Given open the browser
    And i pass the invalid credential
    When i click on login button
    Then i direct to the user dashboard
  @regression @smoke
  Scenario: Login with valid credential provider
    Given open the browser
    And i pass the valid credential user name 'kaz' and password 'kaz'
    When i click on login button
    Then i direct to the user dashboard

    @regression @smoke @sanity
    Scenario: Chekout item
      Given open the browser
      And i pass the valid credential user name 'kaz' and password 'kaz'
      When i click on login button
      Then i direct to the user dashboard and found 1 profile

