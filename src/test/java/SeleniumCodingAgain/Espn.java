package SeleniumCodingAgain;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Espn {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.espncricinfo.com/");
		
		//driver.findElement(By.linkText("Series")).click();
		
		//List<WebElement> values=driver.findElements(By.xpath("//li[@class='nav-item']/div/span[@class='nav-link']"));
		
		List<WebElement> values=driver.findElements(By.xpath("//li[@class='nav-item']"));
		
		System.out.println(values.get(2).getText());
		
	     
		
		

	}

}
