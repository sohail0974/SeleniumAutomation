package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUp_Info extends BasePage {
	
	public SignUp_Info(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//input[@id='password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@id='first_name']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='address1']")
	WebElement txtAddress;
	
	@FindBy(xpath="//select[@id='country']")
	WebElement sltCountry;
	
	@FindBy(xpath="//input[@id='state']")
	WebElement txtState;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement txtCity;
	

	@FindBy(xpath="//input[@id='zipcode']")
	WebElement txtZipcode;
	

	@FindBy(xpath="//input[@id='mobile_number']")
	WebElement txtMobileNum;
	
	@FindBy(xpath="//button[normalize-space()='Create Account']")
	WebElement btnCreateAccount;
	
	@FindBy(xpath="//b[normalize-space()='Account Created!']")
	WebElement status;
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	public void setFirstName(String Name) {
		txtFirstName.sendKeys(Name);
	}
	public void setLastName(String Name) {
		txtLastName.sendKeys(Name);
	}
	
	public void setAddress(String address) {
		txtAddress.sendKeys(address);
	}
	public void setCountry(String country) {
		Select countryslt = new Select(sltCountry);
		countryslt.selectByVisibleText(country);
	}
	public void setState(String state) {
		txtState.sendKeys(state);
	}
	public void setCity(String city) {
		txtCity.sendKeys(city);
	}
	public void setZipcode(String zipcode) {
		txtZipcode.sendKeys(zipcode);
	}
	public void setMobileNum(String mobileNum) {
		txtMobileNum.sendKeys(mobileNum);
	}
	
	public void clickAccount() {
		btnCreateAccount.click();
	} 
	public boolean chckStatus() {
		System.out.println(status.getText());
		if(status.getText().equals("ACCOUNT CREATED!")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
