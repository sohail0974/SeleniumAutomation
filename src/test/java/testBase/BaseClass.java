package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	public static WebDriver driver;
	public Logger logger;
	public Properties P;
	@BeforeClass(groups = {"Master","Sanity","Regression"})
	@Parameters("browser")
	public void setup(String Br) throws IOException {
		FileReader fr = new FileReader("./src/test/resources/config.properties");
		P= new Properties();
		P.load(fr);
		
		logger = LogManager.getLogger(this.getClass());
		
		switch(Br.toLowerCase()) {
			case "edge" : driver = new EdgeDriver(); break;
			case "chrome" : driver = new ChromeDriver(); break;
			default :System.out.println("Invalid Browser Name"); return;
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(P.getProperty("appURL"));
		driver.manage().window().maximize();
	}
	@AfterClass(groups = {"Master","Sanity","Regression"})
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
	public String captureScreen(String tname) throws IOException {
		String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		
		String filePath = System.getProperty("user.dir")+"\\Screenshots"+tname+"_"+timeStamp;
		File targetFile = new File(filePath);
		sourceFile.renameTo(targetFile);
		return filePath;
	}
	
}
