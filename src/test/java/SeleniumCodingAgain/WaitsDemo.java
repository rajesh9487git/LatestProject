package SeleniumCodingAgain;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsDemo {

	private static final String ExpectedConditions = null;

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	
	WebDriverWait wait = new WebDriverWait(driver,2);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
	

	}

}
