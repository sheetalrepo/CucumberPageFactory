@test
Feature: Homepage
  In order to verify search box
  As a user
  I want to verify search result comes

  @tst
  Scenario Outline: Verify search box working
    Given I am on home page
    When I searched for "<keyword>"
    Then I got correct "<keyword>" results

    Examples: 
      | keyword |
      | laptops |