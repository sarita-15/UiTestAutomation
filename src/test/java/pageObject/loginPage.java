package pageObject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;



public class loginPage extends Base {

	public void enterUsernameAndPassword(String user,String pass) {
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys(user);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(pass);
}
	public void clickOnLogibButton() {
		WebElement loginBtn=driver.findElement(By.xpath("//input[@id='login-button']"));
		loginBtn.click();
	}
	public  boolean validatesuccessfullogin(){
	return	driver.findElement(By.xpath("//div[@class='header_label']")).isDisplayed();
	}
	public boolean validateerrormessage() {
	return driver.findElement(By.xpath("//h3[@data-test='error']")).isDisplayed();
	}
}