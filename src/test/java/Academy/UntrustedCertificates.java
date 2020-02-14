package Academy;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UntrustedCertificates {

	public static void main(String[] args) {
		
		Proxy p = new Proxy();
		p.setHttpProxy("localhost:7777");

		DesiredCapabilities ch = DesiredCapabilities.chrome();
		ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.PROXY, p);

		ChromeOptions c = new ChromeOptions();
		c.merge(ch);

		// System.setProperty(arg0, arg1);
		WebDriver driver = new ChromeDriver(c);

		// driver.get(url);

	}

}
