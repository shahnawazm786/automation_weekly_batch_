@Dashboard
Feature: Dashboard

Background:
  Given Open browser
  When  pass the credential for different
  And click to submit button

  @somke
  Scenario: In Originatior dashbaord
   Then dircted to originator dashboard

  Scenario: In Reviewer dashbaord
    Given dircted to reviewer dashboard

  Scenario: In paritcipant dashbaord
    Given dircted to participant dashboard

  Scenario: In approval dashbaord
    Given dircted to approval dashboard

