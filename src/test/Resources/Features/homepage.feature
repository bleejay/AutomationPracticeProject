Feature: From the Homepage, I need to be able to add an item to the cart and then go to the checkout
  @test
  Scenario: I add an item from the homepage
    Given I am on the Homepage
    When I click on the "add item" button
    And I return to the Homepage
    Then That item is added to the cart

#  Scenario: I add an item using Quick View
#    Given I am on the Homepage
#    And I go to quick view
#    When I click on the "qv add item" button
#    And I return to the Homepage
#    Then That item is added to the cart
  @test
  Scenario: I go to checkout from the "Item Added" page
    Given I am on the add item page
    When I click on the "Proceed To Checkout" button
    Then I am taken to the Checkout
  @test
  Scenario: I go to the checkout from the cart
    Given I am on the Homepage
    And I have an item in my cart
    When I click on the "Check out" button
    Then I am taken to the Checkout