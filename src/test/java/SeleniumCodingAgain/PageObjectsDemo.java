package SeleniumCodingAgain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectsDemo {

	WebDriver driver;

	PageObjectsDemo(WebDriver driver) {

		this.driver = driver;

	}
	
	
	By login = By.xpath("//*[@id=\\\"menu-posts\\\"]/a/div[3]");
	
	
	public WebElement loginPage() {
		
		return driver.findElement(login);
		
		
	}
	

}
