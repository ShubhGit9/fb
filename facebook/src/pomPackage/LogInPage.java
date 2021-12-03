package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	@FindBy (xpath="//input[@id='email']")
	private WebElement user;
	
	@FindBy (xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy (xpath="//button[@name='login']")
	private WebElement loginbutton;
	
	@FindBy (xpath="//a[text()='Forgotten account?']")
	private WebElement forgottenPassword;
	
	@FindBy (xpath="//a[text()='Sign up for Facebook']")
	private WebElement signup;
	
	public LogInPage (WebDriver driver){
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void pageAction() {
	signup.click();
		
	}

}
