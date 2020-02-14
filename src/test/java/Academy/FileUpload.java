package Academy;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUpload {

	public static void main(String[] args) throws IOException, InterruptedException {

		String downloadpath = System.getProperty("user.dir");

		System.out.println(downloadpath);

		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		//chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadpath);

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.id("dropzoneInput-label")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\inrrao\\Documents\\FileUpload.exe");

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//button[@class='g-btn g-btn--primary g-btn--medium']")));

		driver.findElement(By.xpath("//button[@class='g-btn g-btn--primary g-btn--medium']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download Now")));

		driver.findElement(By.linkText("Download Now")).click();
		Thread.sleep(5000);

		File f = new File(downloadpath + "/Converted.jpg");

		if (f.exists()) {

			System.out.println("File is downloaded");
		}

		f.delete();

	}

}
