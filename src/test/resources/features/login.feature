
Feature: User login
  as I user
  I want to be able to sign up
  and login to test site

  @test
  Scenario Outline: If I input incorrect password details I will receive the correct error message
    Given I am on the Sign in page
    When I input a valid email address
    And I input an invalid <password>
    Then I receive the corresponding error <error>

    Examples:
      | password |                          error                                                 |
      | a@34567  |  Error Message.   |
      | abcd1234 |   Error Message.   |
      | abcdefgh | Error Message.   |
      | 1234567834234323 |Error Message.   |


