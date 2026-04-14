package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.apache.logging.log4j.*;

public class BaseClass {
	public WebDriver driver;
	public Logger logger;
	@BeforeClass
	public void setup() {
		logger = LogManager.getLogger(this.getClass());
		driver = new EdgeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public void tearDown() {
		driver.quit();
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
