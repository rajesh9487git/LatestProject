package SeleniumCodingAgain;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(3);
		
		String evalue= "rajesh";
       driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("sam");
		
		Thread.sleep(3000);
		
		while(!driver.findElement(By.xpath("//input[@class='_3704LK']")).getAttribute("value").equalsIgnoreCase(evalue)) {
		
		
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys(Keys.ARROW_DOWN);
		
		//String value= driver.findElement(By.xpath("//input[@class='_3704LK']")).getAttribute("value");
		
		//System.out.println(value);
		
		
		}
				
		

	}

}
