package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUp {
	
	private WebDriver driver;
	private Select select;
	
	@FindBy (xpath="//a[@class='_97w5']")
	private WebElement begin;
	
	@FindBy (xpath="//input[@aria-label='First name']")
	private WebElement firstName;
	
	@FindBy (xpath="//input[@aria-label='Surname']")
	private WebElement surName;
	
	@FindBy (xpath="//input[@aria-label='Mobile number or email address']")
	private WebElement mobileOrEmailId;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy (xpath="//select[@aria-label='Day']")
	private WebElement day;
	
	@FindBy (xpath="//select[@aria-label='Month']")
	private WebElement month;
	
	@FindBy (xpath="//select[@aria-label='Year']")
	private WebElement year;
	
	@FindBy (xpath="//input[@id='u_0_6_ZO']")
	private WebElement female;
	
	@FindBy (xpath="//input[@id='u_0_7_pU']")
	private WebElement male;
	
	@FindBy (xpath="//input[@id='u_0_8_t5']")//select[@aria-label='Select your pronoun']
	private WebElement custom;
	
	@FindBy (xpath="//select[@aria-label='Select your pronoun']")
	private WebElement pronoun;
	
	@FindBy (xpath="//input[@id='u_0_y_ts']")
	private WebElement optionalGender;
	
	@FindBy (xpath="(//button[@type=\"submit\"])[1]")
	private WebElement submit;
	
	@FindBy (xpath="//a[@aria-label='Already have an account?']")
	private WebElement alreadyUser;

	public SignUp(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void start() throws InterruptedException {
		begin.click();
		Thread.sleep(2000);
		driver.getTitle();
		firstName.sendKeys("ajay");
		surName.sendKeys("more");
		mobileOrEmailId.sendKeys("0000000000");
		password.sendKeys("ajay@987");
		select=new Select(day);
		select.selectByVisibleText("9");
		select=new Select(month);
		select.selectByVisibleText("Nov");
		select=new Select(year);
		select.selectByVisibleText("2021");
		female.click();
		Thread.sleep(2000);
		male.click();
		Thread.sleep(2000);
		custom.click();
		Thread.sleep(2000);
		select=new Select(pronoun);
		select.selectByIndex(0);
		optionalGender.sendKeys("abc");
		submit.click();
		
	}
	
	public void log() {
		alreadyUser.click();
	}



	
	
	
	
	
	
	
	

}
