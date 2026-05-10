package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Login_info;
import testBase.BaseClass;
import utilities.DataProviders;

public class DDT_Login extends BaseClass {
	@Test(dataProvider="excelDataProvider", dataProviderClass=DataProviders.class,groups = {"Master"})
	public void logIn(String email,String pass,String res){
		logger.info("DDT_Login execution started");
		
		HomePage hp = new HomePage(driver);
		hp.clickSignUpandLogin();
		Login_info lgn = new Login_info(driver);
		lgn.inputEmail(email);
		lgn.inputName(pass);
		lgn.clickLogin();
		if(res.equalsIgnoreCase("Pass")) {
			if(hp.verifyAccountLogged()) {
				Assert.assertTrue(true);
				hp.logoutAccount();
			}
			else {
				
				Assert.assertTrue(false);
				
			}
		}
		if(res.equalsIgnoreCase("Fail")) {
			if(lgn.incorrectDetails()) {
				
				Assert.assertTrue(true);
			}
			else {
				hp.clickSignUpandLogin();
				Assert.assertTrue(false);
				
			}
			
			
		}
		
		
		
	}	
}
