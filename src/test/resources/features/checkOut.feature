@Checkout
Feature: Check out product

  Scenario: Success to checkout
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

    #Step(checkout)
    And User click checkout
    Then User already on checkout dashboard
    When User input "budi" as first name, input "pekerti" as last name, and input "12345" as postal code
    Then User already on checkout overview
    And Verify item price equals with item total
    Then Verify item total plus tax equals with total payment
    When User click finish

    #Expected
    Then User completes checkout

    #Step(Log Out)
    When User Click Burger Button
    And User Click Button Log Out
    Then User already on login page