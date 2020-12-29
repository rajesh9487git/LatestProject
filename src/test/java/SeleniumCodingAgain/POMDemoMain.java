package SeleniumCodingAgain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMDemoMain {

	public static void main(String[] args) {
	
		
		WebDriver driver = new ChromeDriver();
		
		
		
		
		PageObjectsDemo p = new PageObjectsDemo(driver);
		p.loginPage().click();
		

	}

}
