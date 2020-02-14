package SeleniumCodingPractice;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Proxy1 {

	public static void main(String[] args) {
		
	Proxy p = new Proxy();
	p.setHttpProxy("localhost:7777");
	
	DesiredCapabilities ch= DesiredCapabilities.chrome();
	ch.setCapability(CapabilityType.PROXY, p);
	
	ChromeOptions options = new ChromeOptions();
	options.merge(ch);
	WebDriver driver = new ChromeDriver(options);
		
	}

}
