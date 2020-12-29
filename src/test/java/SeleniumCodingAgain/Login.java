package SeleniumCodingAgain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://wordpress.com/alp/?aff=58022&cid=8348279");

		driver.manage().window().maximize();

		driver.findElement(By.linkText("Log In")).click();

		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("password");
		driver.findElement(By.id("wp-submit")).click();

	}

}
