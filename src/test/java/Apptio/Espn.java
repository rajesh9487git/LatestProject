package Apptio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Espn {
	
	
	public void espn(String text1, String text2)

	 {
		System.setProperty("webdriver.chrome.driver","C:/seleniumRelatedSoftwares/chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.espncricinfo.com/");
		driver.findElement(By.linkText(text1)).click();;
		driver.findElement(By.linkText(text2)).click();
		
		
		
		

	}
	
	
	 
	@Test
	public void execution() {
		
	Espn a = new Espn();
	a.espn("Series", "IPL 2020");
	}
	 

}
