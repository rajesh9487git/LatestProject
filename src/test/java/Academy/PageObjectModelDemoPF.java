package Academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects1.GoogleHomePage;
import pageObjects1.GoogleHomePagePF;

public class PageObjectModelDemoPF {

    @Test
	public void login() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		GoogleHomePagePF homePF= new GoogleHomePagePF(driver);
		
		homePF.EnterEmailPF().sendKeys("rajesh");
		
		homePF.EnterPasswordPF().sendKeys("password");
		homePF.EnterHomePF().click();
		
		//driver.close();
		
		
		
	

}
}