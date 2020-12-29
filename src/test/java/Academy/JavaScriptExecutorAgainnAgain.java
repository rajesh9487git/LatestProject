package Academy;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorAgainnAgain {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		String script = "return document.getElementById('fromplacename').value";
		
		String text= (String) js.executeScript(script);
		

	}

}
