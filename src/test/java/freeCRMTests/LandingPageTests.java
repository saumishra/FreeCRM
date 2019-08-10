package freeCRMTests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pageObjects.LandingPage;

public class LandingPageTests extends BaseClass {
	
	LandingPage landingP = new LandingPage();
	
	@Test
	public void validateLandingTitle() {
	
		landingP.launchsite();
		String title = webDriver.getTitle();
		//AssertJUnit.assertEquals(title, prop.getProperty("LoginTitle"));
	}

}
