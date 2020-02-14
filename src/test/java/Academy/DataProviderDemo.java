package Academy;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(dataProvider="getData")
	public void login(String UN, String PWD) {
		
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user_email")).sendKeys(UN);
		driver.findElement(By.id("user_password")).sendKeys(PWD);
		driver.findElement(By.xpath("//input[@class='btn btn-primary btn-md login-button']")).click();
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data = new Object[2][2];
		data[0][0] = "rajesh1";
		data[0][1] = "password1";
		
		data[1][0] = "rajesh2";
		data[1][1] = "password2";
		
		return data;
	}

}
