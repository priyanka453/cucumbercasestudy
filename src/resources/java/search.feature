Feature: Product search
Background: User login
Given user is in login page
When User enters valid credentials and perform login
Then User enters to Home page

Scenario: Search product
Given user should be in home page
When user enters four letters of product
And select product from the list and click on find details
And user enters to product page
And user add product to cart
And user checkout the product
And user procced to pay
And redirecting to payment gatway
And user select bank
And user enter username and password
And user enter transaction password
And user enters in order details
Then signout

Scenario: no product found
Given user must be in home page
When user enters four letters
Then no product name displayed