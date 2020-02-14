package Academy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObjects1.GoogleHomePage;

public class PageObjectModelDemo {

    @Test
	public void login() throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		GoogleHomePage home= new GoogleHomePage(driver);
		home.EnterEmail().sendKeys("Rajesh");
		home.EnterPassword().sendKeys("admin");
		
		home.EnterHome().click();
		
		
		
		
	

}
}