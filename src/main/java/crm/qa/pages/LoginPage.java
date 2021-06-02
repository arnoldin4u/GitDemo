package crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import crm.qa.baseclass.TestBase;


public class LoginPage extends TestBase
{	
	// PageFactory or Object Repository 	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath = "//a[text()='Sign Up']")
	WebElement signup;
	
	@FindBy(xpath = "//img[@class='img-responsive']")
	WebElement crmLogo;
	
	// Initialising Page Objects
	public LoginPage()
	{	PageFactory.initElements(driver, this);		
	}
	
	// Actions
	public String validateLoginPageTitle()
	{	return driver.getTitle();		
	}	
	public boolean validateCRMLogoImage()
	{	return crmLogo.isDisplayed();		
	}
	public HomePage login(String un, String pwd)
	{	username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePage();
	}	
}

