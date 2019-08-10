package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath="//input[@name='email']")
	WebElement emailBox;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement passwordBox;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginButton;
	
	
	public LoginPage() {
		PageFactory.initElements(webDriver, this);
	}
	
	public HomePage doLogin(String un, String pwd){
		
		emailBox.sendKeys(un);
		passwordBox.sendKeys(pwd);
		loginButton.click();
		
		return new HomePage();
		
	
	}

}
