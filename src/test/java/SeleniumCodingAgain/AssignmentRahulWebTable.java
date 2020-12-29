package SeleniumCodingAgain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AssignmentRahulWebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		int rowCount = driver.findElements(By.xpath("//div[@class='left-align']//tbody/tr")).size();

		System.out.println(rowCount);

		int colCount = driver.findElements(By.xpath("//div[@class='left-align']//tbody//th")).size();

		System.out.println(colCount);
		
		String instructor=driver.findElement(By.xpath("//div[@class='left-align']//tbody//tr[2]/td[1]")).getText();
		String course=driver.findElement(By.xpath("//div[@class='left-align']//tbody//tr[2]/td[2]")).getText();
		String price=driver.findElement(By.xpath("//div[@class='left-align']//tbody//tr[2]/td[3]")).getText();
		
		System.out.println(instructor);
		System.out.println(course);
		System.out.println(price);

	}

}
