package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.SignUp_Info;
import pageObjects.User_Signup;
import testBase.BaseClass;


public class SignUp extends BaseClass {
	
	@Test(groups = {"Regression","Master"})
	public void Sign_up() {
		logger.info("***Starting Sign up execution***");
		HomePage hp = new HomePage(driver);
		hp.clickSignUpandLogin();
		User_Signup usp = new User_Signup(driver);
		usp.setUserName(randomString());
		usp.setEmailData(randomString()+"@gmail.com");
		usp.clickSignUpBtn();
		logger.info("Succesfully entered name and email");
		SignUp_Info info = new SignUp_Info(driver);
		info.setPassword(randomAlphaNumeric());
		info.setFirstName(randomString());
		info.setLastName(randomString());
		info.setAddress(randomString());
		info.setCountry("India");
		info.setState(randomString());
		info.setCity(randomString());
		info.setZipcode("500018");
		info.setMobileNum(randomNumber());
		info.clickAccount();
		logger.info("Clicked the create account button");
		boolean status = info.chckStatus();
		if(status) {
			assertTrue(true);
			logger.info("Succesfully executed signup test cases");
		}
		else {
			Assert.fail();
			logger.error("Test Failed");
		}
		logger.info("finished executing sign up test cases");
		
	}	
	
}
