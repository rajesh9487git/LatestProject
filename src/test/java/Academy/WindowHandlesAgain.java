package Academy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesAgain {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.xpath("//*[text()='value']")).click();
		
		Set<String> ids=driver.getWindowHandles();
		
	Iterator<String>id=	ids.iterator();
	
	String parentId=id.next();
	String childId=id.next();
	
	driver.switchTo().window(childId);
	driver.getTitle();
	driver.switchTo().defaultContent();

	}

}
