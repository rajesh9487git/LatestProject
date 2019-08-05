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

public class ValidateTitle extends base {
	private static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		driver= initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		
	}
	
	
	String evalue= "FEATURED COURSES123";
	
	
	@Test
	public void titleValidation() throws IOException {
		
	
		LandingPage l= new LandingPage(driver);
		
		String avalue=l.getTitle().getText();
		System.out.println(avalue);
		Assert.assertEquals(avalue, evalue);
		
		log.info("Title is Validated");
		
		//driver.close();
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		driver=null;
	}

}
