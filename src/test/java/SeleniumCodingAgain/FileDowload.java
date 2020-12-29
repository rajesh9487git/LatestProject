package SeleniumCodingAgain;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FileDowload {

	public static void main(String[] args) {

		String path = System.getProperty("user.dir");

		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("download.default_directory", path);

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver = new ChromeDriver(options);

		File f = new File(path + "conevrte.png");

		if (f.exists()) {

			System.out.println("File is downloaded");
		}

		f.delete();
	}

}
