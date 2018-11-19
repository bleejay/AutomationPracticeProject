Feature: As an existing user, I can start the checkout the procedure from the cart.

  @test
  Scenario: As a user that is signed in, I can start the checkout procedure by clicking proceed to checkout
    Given I am on the cart page
    And I am signed in as an existing user
    When I click to the proceed to checkout
    Then I go to the Address confirmation page
