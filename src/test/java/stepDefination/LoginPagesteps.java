package stepDefination;


import static org.junit.Assert.assertTrue;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.loginPage;


public class LoginPagesteps {
	loginPage login = new loginPage();
	
	@When("user enter {string}_ and {string}")
	public void user_enter_and(String Username,String Password) {
		login.enterUsernameAndPassword(Username, Password);
	}
	
	
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		login.clickOnLogibButton();
	}

	@Then("Validate succesful login")
	public void validate_succesful_login() {
	Assert.assertTrue( login.validatesuccessfullogin());
	}


@Then ("validate error message")
public void validate_error_message() {
	Assert.assertTrue(login.validateerrormessage());
}
}
