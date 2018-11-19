Feature: During the whole transaction journey
  I want to ensure the totals on each page much up

  @HighRisk
  Scenario:
    Given I am an existing user, I am on the homepage and I would like to purchase one item
    When I proceed through the transaction process
    Then I ensure that all totals much up on each page I visit that lists the total order value