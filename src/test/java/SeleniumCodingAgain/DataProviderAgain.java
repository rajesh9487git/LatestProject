package SeleniumCodingAgain;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAgain {

	@Test(dataProvider = "getData")
	public void testing(String un, String pwd) {

		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user_email")).sendKeys(un);
		driver.findElement(By.id("user_password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@class='btn btn-primary btn-md login-button']")).click();
	}

	@DataProvider
	public Object[][] getData() throws IOException {

		ExcelDemoAgain e = new ExcelDemoAgain();
		int count = e.rowCount(0);

		Object[][] a = new Object[count][2];

		for (int i = 0; i < count; i++) {

			a[i][0] = e.getExcelData(0, i, 0);
			a[i][1] = e.getExcelData(0, i, 1);

		}
		return a;

	}

}
