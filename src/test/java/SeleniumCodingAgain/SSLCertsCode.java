package SeleniumCodingAgain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertsCode {

	public static void main(String[] args) {
	
		DesiredCapabilities ch=    DesiredCapabilities.chrome();
		
		ch.acceptInsecureCerts();
		
		ChromeOptions c = new ChromeOptions();
		
		c.merge(ch);
		
		WebDriver driver = new ChromeDriver(c);

	}

}
