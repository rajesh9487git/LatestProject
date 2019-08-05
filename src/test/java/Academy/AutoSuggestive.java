package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/seleniumRelatedSoftwares/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.makemytrip.com/");
		 Thread.sleep(3000);

		 driver.findElement(By.xpath("//input[@id='fromCity']")).click();

		 WebElement source = driver.findElement(By.xpath("//input[@placeholder='From']"));

		 Thread.sleep(1000);
		source.sendKeys("ban");
		Thread.sleep(2000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='toCity']")).click();
		WebElement destination = driver.findElement(By.xpath("//input[@placeholder='To']"));
		
		destination.click();
		destination.sendKeys("del");
		Thread.sleep(2000);
		
		
		
		for(int i= 1; i<4;i++) {
		destination.sendKeys(Keys.ARROW_DOWN);
		
		}
		
		destination.sendKeys(Keys.ENTER);

	}

}
