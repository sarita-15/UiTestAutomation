package pageObject;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class CheckoutPage extends Base {
	public void clickonCartBtn() {
		WebElement cartBtn = driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge' ]"));
		cartBtn.click();
	}

	public void clickOnCheckoutBtn() {
		WebElement checkoutBtn = driver.findElement(By.xpath("//a[@class='btn_action checkout_button']"));
		checkoutBtn.click();
	}

	public void checkoutYourInformation(String firstname, String lastname, String zipcode) {
		WebElement Firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
		Firstname.sendKeys(firstname);

		WebElement Lastname = driver.findElement(By.xpath("//input[@data-test='lastName']"));
		Lastname.sendKeys(lastname);

		WebElement Zipcode = driver.findElement(By.xpath("//input[@data-test='postalCode']"));
		Zipcode.sendKeys(zipcode);

	}

	public void userclickonContinueBtn() {
		WebElement ContinueBtn = driver.findElement(By.xpath("//input[@class='btn_primary cart_button'] "));
		ContinueBtn.click();

	}
	
	public boolean validateErrorMesssage() {
		return driver.findElement(By.xpath("//div/h2[@class='complete-header']")).isDisplayed();
		
	}

	public void clickonFinishBtn() {
		WebElement FinishBtn = driver.findElement(By.xpath("//a[@class='btn_action cart_button' ]"));
		FinishBtn.click();
	}

	public boolean validateOrderSuccessMessage() {
		return driver.findElement(By.xpath("//div[@class='subheader']")).isDisplayed();
	}

	public void clickonremoveBtn() {
		WebElement removeBtn = driver.findElement(By.xpath("//button[@class='btn_secondary cart_button' ]"));
		removeBtn.click();
	}

	public boolean validateproductremoved() {
		return driver.findElement(By.xpath("//div[@class='subheader']")).isDisplayed();

	}

}
