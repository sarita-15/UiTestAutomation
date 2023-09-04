package stepDefination;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CheckoutPage;

public class checkoutPage {

	CheckoutPage checkout = new CheckoutPage();

	@Then("click on CartBtn")
	public void click_on_cart_btn() {
		checkout.clickonCartBtn();
	}

	@Then("user click on checkout button")
	public void user_click_on_checkout_button() {
		checkout.clickOnCheckoutBtn();

	}

	@And("user enter {string} {string} {string}")
	public void user_enter(String firstname, String lastname, String zipcode) {
		checkout.checkoutYourInformation(firstname, lastname, zipcode);
	}


	@And("user click on countinue button")
	public void user_click_on_countinue_button() {
		checkout.userclickonContinueBtn();
	}
	@Then("validate expected {string}")
	public void validate_expected(String errormessage) {
		 boolean actualErrorMessage= checkout.validateOrderSuccessMessage();
	        Assert.assertTrue(errormessage,actualErrorMessage);
	  
	}
	@And("user click on finish button")
	public void user_click_on_finish_button() {
		checkout.clickonFinishBtn();
	}

	@Then("validate order success message")
	public void validate_order_success_message() {
		Assert.assertTrue(checkout.validateOrderSuccessMessage());
	}

	@When("the user clicks on the Remove button for a product")
	public void the_user_clicks_on_the_remove_button_for_a_product() {
		checkout.clickonremoveBtn();
	}

	@Then("validate the product removed")
	public void the_product_is_removed_from_the_cart() {
		Assert.assertTrue(checkout.validateproductremoved());
	}

	
}
