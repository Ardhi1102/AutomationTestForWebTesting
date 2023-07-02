@Filter
Feature: Filter
  As a user I want select and buy item on website sauce demo

  Scenario: User sort product cart
    Given User already on login page
    When User input "standard_user" as username and input "secret_sauce" as password
    Then User already on sales page
    When User sort product list by "Name (Z to A)"
    Then User already on filter result