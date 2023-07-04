@Filter
Feature: Filter
  As a user I want sort by "Name (Z to A)"

  Scenario: Success to use filter feature
    #Precondition
    Given User already on login page

    #Step(valid login)
    When User input "standard_user" as username and input "secret_sauce" as password
    Then User already on sales page

    #Step(filter name Z to A)
    When User sort product list by "Name (Z to A)"
    Then User already on filter result