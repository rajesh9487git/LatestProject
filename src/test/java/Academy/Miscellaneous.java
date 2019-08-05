package Academy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Miscellaneous {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> linksCount=driver.findElements(By.tagName("a"));
		
		System.out.println(linksCount.size());
		
		
	}

}
