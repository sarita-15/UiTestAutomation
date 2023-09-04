package stepDefination;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.BasketPage;
import static org.junit.Assert.assertTrue;

public class BasketPageSteps {
	BasketPage basket = new BasketPage();

	@When("user add product into the cart")
	public void user_add_product_into_the_cart() {
		basket.addTocart();
	}

	@Then("validate cart count is {string}")
	public void validate_cart_count_is(String count) {
		basket.validateCartCount(count);
	}

	@Then("click on hamburger menu")
	public void click_on_hamburger_menu() {
		basket.clickOnHamburgerMenu();
	}

	@Then("click on logout option")
	public void click_on_logout_option() {
		basket.clickOnLogoutOption();
	}

	@Then("validate successful logout")
	public void validate_successful_logout() {
		Assert.assertTrue(basket.validateSuccessfulLogout());
	}

}
