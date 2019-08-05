package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(3000L);
		//System.out.println(driver.findElements(By.tagName("iframe")).size());

		driver.switchTo().frame(0);
		
		Actions a = new Actions(driver);

		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));

		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Accept")).click();

	}

}
