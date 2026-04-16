package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Login_info;
import testBase.BaseClass;
public class Login extends BaseClass {
	@Test
	public void logIn() {
		HomePage hp = new HomePage(driver);
		hp.clickSignUpandLogin();
		Login_info lgn = new Login_info(driver);
		lgn.inputEmail(P.getProperty("email"));
		lgn.inputName(P.getProperty("password"));
		lgn.clickLogin();
		if(hp.verifyAccountLogged()) {
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
		}
	}
}
