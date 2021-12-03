package testPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pomPackage.SignUp;

public class TestX {
	WebDriver driver;
	SignUp signup;
	
	@BeforeClass
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","H:\\shubham\\automation\\chromedriver1.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/login/");
	}
	
	@BeforeMethod
	public void obj() throws InterruptedException {
    signup= new SignUp(driver);
	}
	
	@Test
	public void test() throws InterruptedException {
		signup.start();
		
	}
	
//	@AfterMethod
//	public void back() {
//		signup.log();
//	}
//	
//	@AfterClass
//	public void exit() {
//		driver.close();
//	}
//	
	
}
