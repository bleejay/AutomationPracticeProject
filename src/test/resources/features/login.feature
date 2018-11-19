
Feature: User login
  as a user
  I want to be able to login to the automation site

  @test
  Scenario Outline: If I input incorrect password details I will receive the correct error message
    Given I am on the Sign in page
    When I input a valid email address <emailaddress>
    And I input an invalid <password>
    Then I receive the corresponding error <error>

    Examples:
      |   emailaddress  |     password     |             error               |
      |                 |                  |    An email address required.   |
      |dsfasag@gmail.com|                  |       Password is required.     |
      |                 |     agdfadsfa    |    An email address required.   |
      |fasfdg@gmail.com | 1234567834234323 |      Authentication failed.     |

  @test
  Scenario Outline: If i input correct username and password details i will be signed in
    Given I am on the Sign in page
    When I input a valid email address <emailaddress>
    And I input a valid password <password>
    Then I am taken to the correct page

    Examples:
      | emailaddress        | password    |
      |samgrill101@gmail.com|engineering19|


