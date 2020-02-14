package SeleniumCodingPractice;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownLoads {

	public static void main(String[] args) {
		
		String downloadPath= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("download.default_directory", downloadPath);
		
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs",chromePrefs );
		
		WebDriver driver = new ChromeDriver(options);
		
		File f = new File(downloadPath+ "Converted.jpeg");
		
		if(f.exists()) {
			
			System.out.println("File is downloaded");
		}
		
		f.delete();

	}

}
