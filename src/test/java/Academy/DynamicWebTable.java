package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-admin/index.php");
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("demo123");
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		
		
		driver.findElement(By.xpath("//*[@id='menu-posts']/a/div[3]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Wish to Remove a true home Equity Loan?')]/parent::strong/parent::td//preceding-sibling::th//input[@name='post[]']")).click();
		
       
	}

}
