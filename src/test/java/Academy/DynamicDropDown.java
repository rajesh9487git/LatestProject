package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/seleniumRelatedSoftwares/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("https://www.spicejet.com/");
		 
		 driver.findElement(By.xpath("//*[@name='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		 
		 driver.findElement(By.xpath("//a[@value='BLR']")).click();
		 Thread.sleep(2000L);
		 driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		

	}

}
