@srp
Feature: Search page
  In order to verify search page
  As a user
  I want to verify offers and product page navigation

  @critical
  Scenario: Verify offers in srp
    Given I am on home page
    When I searched for "shoes"
    Then I am on search page
    When I click first offer
    Then filtered brand should get added in header
