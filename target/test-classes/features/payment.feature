Feature: payment tFunctionality
@Reg1
Scenario: payment with COD
When user enter "standard_user"_ and "secret_sauce"
And user clicks on login button
And user add product into the cart
Then validate cart count is "1"
And click on CartBtn
And user click on checkout button
And user enter "lipi" "Automation" "202325"
And user click on countinue button
And user click on finish button
Then validate order success message

@Reg1
Scenario Outline: checkout information fail possible combinations
When user enter "standard_user"_ and "secret_sauce"
And user clicks on login button
And user add product into the cart
Then validate cart count is "1"
And click on CartBtn
And user click on checkout button
And user enter "<firstname>" "<lastname>" "<zipcode>" 
And user click on countinue button
Then validate expected "<error message>"
And user click on finish button
Then validate order success message


Examples:

|firstname|lastname|zipcode|error message|
|First|Last|incorrectzipcode|Postal Code is required|
|First|incorrectlastname|Zip|Last Name is required|
|incorrectlfastname|Last|incorrectzipcode|First Name is required|
|invalid|invalid|invalid|First Name is required|



@Reg1
Scenario Outline: checkout information fail possible combinations
When user enter "standard_user"_ and "secret_sauce"
And user clicks on login button
And user add product into the cart
Then validate cart count is "1"
And click on CartBtn
And user click on checkout button
And user enter "<firstname>" "<lastname>" "<zipcode>" 
And user click on countinue button
Then validate expected "<error message>"



Examples:

|firstname|lastname|zipcode|error message|
|First|Last|incorrectzipcode|Postal Code is required|
|First|incorrectlastname|Zip|Last Name is required|
|incorrectlfastname|Last|incorrectzipcode|First Name is required|
|invalid|invalid|invalid|First Name is required|


@Reg1
Scenario: User removes a product from the cart and verifies the updated product 
When user enter "standard_user"_ and "secret_sauce"
And user clicks on login button
And user add product into the cart
Then validate cart count is "1"
And click on CartBtn
When the user clicks on the Remove button for a product
Then validate the product removed


