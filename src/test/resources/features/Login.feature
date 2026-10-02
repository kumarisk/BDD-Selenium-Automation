@Login
Feature: Login functionality

  Background:
    Given user is on the login page


  @Smoke @Positive
  Scenario: Successful login

    When user enters username "testuser@gmail.com"
    And user enters password "password"
    And user clicks on login button

    Then home page should be displayed