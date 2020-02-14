package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemo01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("user_email")).sendKeys("Rajesh");
		driver.findElement(By.id("user_password")).sendKeys("password");
		driver.findElement(By.xpath("//input[@class='btn btn-primary btn-md login-button']")).click();

	}

}
