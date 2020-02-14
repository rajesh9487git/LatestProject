package SeleniumCodingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo01 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/guru99home/");
		// driver.manage().window().maximize();
		int frameCount = driver.findElements(By.tagName("iframe")).size();
		// System.out.println(frameCount);
		int temp = 0;

		for (int i = 0; i < frameCount; i++) {

			driver.switchTo().frame(i);
			int total = driver.findElements(By.xpath("html/body/a/img")).size();
			// System.out.println(total);
			driver.switchTo().defaultContent();
			if (total == 1) {

				temp = i;
				System.out.println("Index is ---> " + temp);
			}

		}

		driver.switchTo().frame(temp);
		driver.findElement(By.xpath("html/body/a/img")).click();

	}

}
