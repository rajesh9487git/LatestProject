package SeleniumCodingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		
		WebElement dropDwon=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s= new Select(dropDwon);
		s.selectByValue("USD");
		Thread.sleep(1000);
		s.selectByVisibleText("AED");
	
		
		
		
		
		
	}

}
