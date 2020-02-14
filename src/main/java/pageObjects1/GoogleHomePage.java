package pageObjects1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {
	
	WebDriver driver;

	public GoogleHomePage(WebDriver driver) {
		
		this.driver=driver;
	}
	

	
	By Email = By.xpath("//input[@id='login1']");
	By Password = By.xpath("//input[@id='password']");
	//By Home = By.linkText("News");
	By Home = By.xpath("//a[contains(text(),'Home')]");
	
	
	
	public WebElement EnterEmail() {
		
		return driver.findElement(Email);
		
	}
	
	
	
public WebElement EnterPassword() {
		
		return driver.findElement(Password);
		
	}
	
	

public WebElement EnterHome() {
	
	return driver.findElement(Home);
	
}



	
	
}
