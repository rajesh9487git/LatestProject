package SeleniumCodingAgain;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseDemo {

	

	
	
	@Test
	public void screenshot(String result) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "driverpath");
		WebDriver driver = new ChromeDriver();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("C://TestScreenshots//" + result + "screenshot.png"));
		
		
	}

}
