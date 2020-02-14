package SeleniumCodingPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsertestingMethods {

	WebDriver driver;

	@Test
	@Parameters("Browser")
	public void InitiliazeBrowsers(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
		}

		else if (browser.equalsIgnoreCase("ff")) {

			System.setProperty("webdriver.gecko.driver", "C:/seleniumRelatedSoftwares/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com/");
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		
	}

}
