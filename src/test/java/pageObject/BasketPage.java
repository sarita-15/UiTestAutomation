package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;
import io.cucumber.java.en.Then;

public class BasketPage extends Base {

	public void addTocart() {
		WebElement addToCartBtn = driver.findElement(By.xpath("(//button[@class='btn_primary btn_inventory'])[1]"));
		try {
			addToCartBtn.click();
		} catch (Exception e) {

		}
	}

	public void validateCartCount(String count) {
		WebElement CartCount = driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
		String CartCountText = CartCount.getText();
		Assert.assertEquals(count, CartCountText);
	}

	public void clickOnHamburgerMenu() {
		WebElement HamburgerMenu = driver.findElement(By.xpath("//div[@class='bm-burger-button']"));
		HamburgerMenu.click();

	}

	public void clickOnLogoutOption() {
		WebElement LogoutOption = driver.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		LogoutOption.click();
	}

	public boolean validateSuccessfulLogout() {
		return driver.findElement(By.xpath("//div[@id='login_credentials']")).isDisplayed();
	}


		
	

}