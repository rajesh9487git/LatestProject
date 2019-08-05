package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/seleniumRelatedSoftwares/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		 //driver.manage().window().maximize();
		 
		 Select s= new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		 s.selectByValue("AED");
		 s.selectByVisibleText("USD");
		 
		 
		 //driver.quit();
		}

}
