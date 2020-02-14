package SeleniumCodingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class ToolTipDemo {

	public static void main(String[] args) {

		String Expected = "What's new in 3.2";
        System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/tooltip.html");
		WebElement downloadButton = driver.findElement(By.id("download_now"));
		Actions action = new Actions(driver);
		action.moveToElement(downloadButton).build().perform();
		String Actual = driver.findElement(By.linkText("What's new in 3.2")).getText();
		Assert.assertEquals(Expected, Actual);
		System.out.println("Message is verified");
		driver.quit();
		
	   

	}

}
