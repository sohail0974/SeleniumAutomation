package pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	public String randomAlphaNumeric() {
		String generatedpass = RandomStringUtils.randomAlphanumeric(7);
		return generatedpass;
	}
	public String randomNumber() {
		String generatedpass = RandomStringUtils.randomNumeric(10);
		return generatedpass;
	}
}
