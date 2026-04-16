package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends BasePage{
	
	public HomePage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()='Signup / Login']")
	WebElement signUporLogin;
	@FindBy(xpath="//a[normalize-space()='Delete Account']")
	WebElement DeleteAccount;
	public void clickSignUpandLogin() {
		signUporLogin.click();
	}
	public boolean verifyAccountLogged() {
		return DeleteAccount.isDisplayed();
	}
}
