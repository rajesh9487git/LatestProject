package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/seleniumRelatedSoftwares/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		 //driver.manage().window().maximize();
		 
		 Select s= new Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		/* s.selectByValue("AED");
		 Thread.sleep(1000);
		 s.selectByVisibleText("USD");*/
		 
		 
		int optionssize= s.getOptions().size();
		s.selectByIndex(optionssize-1);
		 
		 //driver.quit();
		}

}
