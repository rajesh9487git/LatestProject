package SeleniumCodingPractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.id("dropzoneInput-label")).click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("C:\\Users\\inrrao\\Documents\\FileUpload.exe");
		
	}

}
