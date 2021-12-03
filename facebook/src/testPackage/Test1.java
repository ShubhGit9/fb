package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomPackage.LogInPage;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","H:\\shubham\\automation\\chromedriver1.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/login/");
		
		LogInPage loginPage =new LogInPage(driver);
		
		loginPage.pageAction();
		

	}

}
