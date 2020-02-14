package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class LoginDemo {
	
	WebDriver driver;

	public void LoginGmail() {
		
		System.setProperty("WebDriver.chrome.driver","C:/seleniumRelatedSoftwares/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm%26ogbl&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		
		driver.findElement(By.id("identifierId")).sendKeys("rajesh94872gmail.com");;
		driver.findElement(By.id("identifierId")).sendKeys("password");
		driver.findElement(By.id("identifierId")).click();
	
	}
	

	}


