package pageObjects1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleHomePagePF {

	WebDriver driver;
	
	public GoogleHomePagePF(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement Email;
	
	
	@FindBy(xpath="//input[@id='password']")
	WebElement Password;
	
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement Home;
	
	
	
	
	public WebElement EnterEmailPF() {
		
		return Email;
	}
	
	
public WebElement EnterPasswordPF() {
		
		return Password;
	}

public WebElement EnterHomePF() {
	
	return Home;
}
	
}
