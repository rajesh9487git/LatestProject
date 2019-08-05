package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	
	
	By signin= By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a/span");
	By title = By.xpath("//*[@id=\"content\"]/div/div/h2");
	By NavigationBar = By.xpath("//*[@id=\"content\"]/div/div/h2");
	
	
	public WebElement getLogin() {
		
		return driver.findElement(signin);
		
	}
	
public WebElement getTitle() {
		
		return driver.findElement(title);
		
	}

public WebElement getNavigationBar() {
	
	return driver.findElement(NavigationBar);
	
}

	

}
