package freeCRMTests;

import org.testng.annotations.Test;
import org.testng.Assert;


import base.BaseClass;
import pageObjects.LandingPage;

public class LandingPageTests extends BaseClass {

	
	@Test
	public void validateLandingTitle() {

		LandingPage landingP = new LandingPage();
		landingP.launchsite();
		String title = webDriver.getTitle();
		Assert.assertEquals(title, prop.getProperty("LoginTitle"));
	}
}
