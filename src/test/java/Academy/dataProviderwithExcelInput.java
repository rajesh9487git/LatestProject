package Academy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderwithExcelInput {

	@Test(dataProvider = "getData")
	public void login(String un, String pwd) {

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
		int count = e.getRow(1);

		Object[][] data = new Object[count][2];

		for (int i = 0; i < count; i++) {

			data[i][0] = (e.getValues(1, i, 0));
			data[i][1] = (e.getValues(1, i, 1));

		}

		return data;
	}
}
