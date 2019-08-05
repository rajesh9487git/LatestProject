package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class ValidateNavigationBar extends base {
	
	private static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		driver= initializeDriver();
		log.info("Driver is Initialized");
		
		driver.get(prop.getProperty("url"));
		
	}

	
	
	@Test
	public void NavigationValidation() throws IOException {
		
	
		LandingPage l= new LandingPage(driver);
		
		Boolean BarIsDisplayed=l.getNavigationBar().isDisplayed();
		Assert.assertTrue(BarIsDisplayed);
		
		log.info("Navigation Bar is validated");
		
		//driver.close();
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		driver=null;
	}

}
