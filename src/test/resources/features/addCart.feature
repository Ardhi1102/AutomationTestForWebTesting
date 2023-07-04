@AddCart
Feature: Add to Cart
  As a user I want add T shirt Red and sauce onesie to cart

  Scenario: Add product to cart
    #Precondition
    Given User already on login page

    #Step(valid login)
    When User input "standard_user" as username and input "secret_sauce" as password
    Then User already on sales page

    #Step(filter name Z to A)
    When User sort product list by "Name (Z to A)"
    Then User already on filter result

    #Step(add to cart)
    When User Click Add T Shirt Red
    And User Click Add Sauce Onesie
    And User Click Container
    And User Click Remove T Shirt Red
    Then User can view added cart