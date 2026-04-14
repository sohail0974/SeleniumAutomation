package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Signup extends BasePage{
	public User_Signup(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Name']")
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@data-qa='signup-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//button[normalize-space()='Signup']")
	WebElement btnSignup;
	
	public void setUserName(String Name) {
		txtUserName.sendKeys(Name);
	}
	public void setEmailData(String Email) {
		txtEmail.sendKeys(Email);
	}
	public void clickSignUpBtn() {
		btnSignup.click();
	}
}
