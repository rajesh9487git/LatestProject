package SeleniumCodingPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_date")).click();

		while (!driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"))
				.getText().contains("October")) {

			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();

		}

		List<WebElement> days = driver.findElements(By.className("day"));

		for (int i = 0; i < days.size(); i++) {

			String text = days.get(i).getText();

			if (text.equalsIgnoreCase("16")) {

				days.get(i).click();
				break;
			}

		}

	}

}
