package SeleniumCodingPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UntrustedCerts {

	public static void main(String[] args) {
		
		DesiredCapabilities ch = DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
		
		ChromeOptions options = new ChromeOptions();
		options.merge(ch);
		
		WebDriver driver = new ChromeDriver(options);
		
		
		
		
	}

}
