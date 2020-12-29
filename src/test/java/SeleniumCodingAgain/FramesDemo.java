package SeleniumCodingAgain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/guru99home");

		int count = driver.findElements(By.tagName("iframe")).size();
		int temp = 0;

		for (int i = 0; i < count; i++) {

			driver.switchTo().frame(i);
			int totalcount = driver.findElements(By.xpath("html/body/a/img")).size();
			driver.switchTo().defaultContent();
			if (totalcount == 1) {

				temp = i;
				
				break;
			}
		}

		driver.switchTo().frame(temp);
		driver.getTitle();

	}

}
