package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:/seleniumRelatedSoftwares/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);

		 driver.findElement(By.xpath("//div[@class='display']//form//input")).click();
		 //Thread.sleep(3000);
		 System.out.println(driver.switchTo().alert().getText());
		 driver.switchTo().alert().accept();
	}

}
