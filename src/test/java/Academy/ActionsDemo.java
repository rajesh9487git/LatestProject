package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/seleniumRelatedSoftwares/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 //driver.manage().window().maximize();
		 driver.get("https://www.amazon.in/");
		 Thread.sleep(2000);
		 
		 Actions a = new Actions(driver);
		 a.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).contextClick().build().perform();
		
		 
          
		
		
	}

}
