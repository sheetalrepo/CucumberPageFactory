@test
Feature: Homepage
  In order to verify search box
  As a user
  I want to verify search result comes

  @testbrowser
  Scenario: Verify browser opens
    Given I am on home page
    Then I verify that 10 is greater than 5

  @testassert
  Scenario: Verify assert works
    Given I verify that 10 is greater than 5
