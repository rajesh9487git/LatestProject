package SeleniumCodingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptExecutor {

	@Test
	public void javaScript() {
		
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://ksrtc.in");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fromPlaceName")).click();
		driver.findElement(By.id("fromPlaceName")).sendKeys("Bang");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById('fromPlaceName').value";
		
		String text=(String) js.executeScript(script);
		
		System.out.println(text);
		
	
		
		
		
		

	}

}
