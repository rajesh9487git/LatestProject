package Academy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");
		//driver.manage().window().maximize();
		// Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();

		while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("october")) {

			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();

			List<WebElement> dates = driver.findElements(By.className("day"));
			int count = dates.size();

			for (int i = 0; i < count; i++) {

				String text= dates.get(i).getText();

				if (text.equalsIgnoreCase("16")) {

					dates.get(i).click();
					break;
				}
			}

		}

	}
}
