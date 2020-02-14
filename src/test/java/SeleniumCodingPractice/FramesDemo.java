package SeleniumCodingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		Thread.sleep(3000);
		//WebElement myFrame=driver.findElement(By.xpath("html/body/a/img"));
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='a077aa5e']")));
		driver.findElement(By.xpath("html/body/a/img")).click();
		//driver.quit();
		
		

	}

}
