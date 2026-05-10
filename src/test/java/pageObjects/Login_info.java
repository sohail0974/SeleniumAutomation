package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_info extends BasePage {
	public Login_info(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@data-qa='login-email']")
	WebElement txtemail;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txtpassword;
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btnLogin;
	@FindBy(xpath="//p[normalize-space()='Your email or password is incorrect!']")
	WebElement authtext;
	public void inputEmail(String email) {
		txtemail.sendKeys(email);
	}
	public void inputName(String pass) {
		txtpassword.sendKeys(pass);
	}
	public void clickLogin() {
		btnLogin.click();
	}
	public boolean incorrectDetails() {
		return authtext.isDisplayed();
	}
}
