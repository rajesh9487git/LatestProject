package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base{
	
	private static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void launchBrowser() throws IOException {
		driver= initializeDriver();
		log.info("Driver is initialized");
		
		//driver.get(prop.getProperty("url"));
		
	}
	
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String UN, String pwd) throws IOException {
		
		//driver= initializeDriver();
		driver.get(prop.getProperty("url"));
		
		LandingPage l= new LandingPage(driver);
		l.getLogin().click();
		
		LoginPage lp= new LoginPage(driver);
		lp.getEmail().sendKeys(UN);
		lp.getPassword().sendKeys(pwd);
		lp.getLogin().click();
		
		
	}
	
	
	
	
	
	@DataProvider
    public Object[][] getData() {
		
		Object[][] data=new Object[2][2];
		
		data[0][0]="restrcicteduser@qa.com";
		data[0][1]="12345678";
		
		data[1][0] ="nonrestrcicteduser@qa.com";
		data[1][1] ="4567888";
		
		return data;
		
	}
	

	@AfterTest
	public void tearDown() {
		
		driver.close();
		driver=null;
		
	}
}
