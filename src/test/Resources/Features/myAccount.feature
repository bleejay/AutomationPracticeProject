Feature: After signing in
  I would like to navigate through the my accounts paths on the website


@MyAccountTest
Scenario:
  Given That I am successfully signed in
  And I am on the My Account Page
  When I click on the Order History and Details button
  Then I go to the Order History and Details page

Scenario:
  Given That I am successfully signed in
  And I am on the My Account Page
  When I click on the My Credit Slips button
  Then I go to the My Credit Slips page

Scenario:
  Given That I am successfully signed in
  And I am on the My Account Page
  When I click on the My Addresses button
  Then I go to the My Addresses page

Scenario:
  Given That I am successfully signed in
  And I am on the My Account Page
  When I click on the My Personal Information button
  Then I go to the My Personal Information page

Scenario:
  Given That I am successfully signed in
  And I am on the My Account Page
  When I click on the My Wishlists button
  Then I go to the My Wishlists page

Scenario:
  Given That I am successfully signed in
  And I am on the My Account Page
  When I click on the Home button
  Then I go to the Home page

Scenario:
  Given That I am successfully signed in
  And I am on the My Account Page
  When I click on the Sign Out button
  Then I go to the Sign In page

Scenario:
  Given That I am successfully signed in
  And I am on the My Account Page
  When I click on the Checkout button
  Then I go to the Checkout page