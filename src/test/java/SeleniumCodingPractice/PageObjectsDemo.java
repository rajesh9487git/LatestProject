package SeleniumCodingPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPageDemo;

public class PageObjectsDemo {
	
	public void loginAgain() {
		
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("google.com");
		LoginPageDemo l = new LoginPageDemo(driver);
		l.getEmail().sendKeys("rajesh");
		l.getPassword().sendKeys("pwd");
		l.getLoginButton().click();
		
		
	}

}
