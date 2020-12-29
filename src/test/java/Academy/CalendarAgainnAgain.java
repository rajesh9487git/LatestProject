package Academy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarAgainnAgain {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();

		while (!driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"))
				.getText().contains("October")) {

			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
		}

		List<WebElement> days = driver.findElements(By.xpath("//td[@class='day']"));
		int count = days.size();

		for (int i = 0; i < count; i++) {

			String day = days.get(i).getText();
			if (day.equalsIgnoreCase("25")) {

				days.get(i).click();
				break;
			}
		}

	}
}
