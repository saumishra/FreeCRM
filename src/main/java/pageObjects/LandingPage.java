package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LandingPage extends BaseClass {

	
	@FindBy(xpath="//a[text() = 'Login']")
	WebElement loginLink;
	
	public LandingPage(){
		PageFactory.initElements(webDriver, this);
	}
	
	
	public void launchsite() {
		webDriver.get(prop.getProperty("baseURL"));
	}
	
	public LoginPage clickOnLogin() {
	loginLink.click();
	return new LoginPage();
}


}
