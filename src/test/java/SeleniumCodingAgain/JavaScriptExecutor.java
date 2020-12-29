package SeleniumCodingAgain;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {

		System.setProperty("webdriver.chorme.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://ksrtc.in");

		driver.findElement(By.id("fromPlaceName")).click();
		driver.findElement(By.id("fromPlaceName")).sendKeys("bang");
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementById('idname').value";

		String text = (String) js.executeScript(script);

		System.out.println(text);

	}

}
