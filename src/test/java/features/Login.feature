Feature: Login Functionality

@Reg1
Scenario: login with valid deatils
When user enter "standard_user"_ and "secret_sauce"
And user clicks on login button
Then Validate succesful login

@Reg1
Scenario: login with invalid deatils
When user enter "standard_test"_ and "secret_test"
And user clicks on login button
Then validate error message

@Reg1
Scenario: login when username is wrong and password is correct
When user enter "standard_test"_ and "secret_sauce"
And user clicks on login button
Then validate error message
