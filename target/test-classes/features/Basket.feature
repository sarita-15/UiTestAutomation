Feature: BasketFunctionality
@Reg1
Scenario: Add to cart from PLP
When user enter "standard_user"_ and "secret_sauce"
And user clicks on login button
And user add product into the cart
Then validate cart count is "1"

@Reg1
Scenario: logout from hamburger menu
When user enter "standard_user"_ and "secret_sauce"
And user clicks on login button
Then click on hamburger menu
And click on logout option
Then validate successful logout
