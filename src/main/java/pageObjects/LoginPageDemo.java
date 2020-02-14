package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPageDemo {
	
	WebDriver driver;
	
	public LoginPageDemo(WebDriver driver) {
		this.driver=driver;
		
		}
	

	By email = By.xpath("//*[@id=\"user_email\"]");
	By password = By.id("12345");
	
	@FindBy(xpath="//*[@id=\"new_user\"]/div[3]/input")
	WebElement LoginButton;
	
	
	
	
	public WebElement getEmail() {
		
		return driver.findElement(email);
		}
	
	
public WebElement getPassword() {
		
		return driver.findElement(password);
		}

public WebElement getLoginButton() {
	
	return LoginButton;
}
	
}



















