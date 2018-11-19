Feature: After I have placed an order
  the details of the order are listed
  in my order history page

  @OrderHistoryTest
  Scenario: After I have ordered an item, I want to check it is in my Order History
    Given I have placed an order
    And The order went through correctly
    When I go to the Order History Page
    Then I see the details of the order I have just placed

