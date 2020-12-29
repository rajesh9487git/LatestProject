package SeleniumCodingAgain;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAutoSuggestive {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sam");
		
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);

		String value = driver.findElement(By.id("twotabsearchtextbox")).getAttribute("value");

		System.out.println(value);

	}

}
