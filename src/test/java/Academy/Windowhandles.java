package Academy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@target='_blank']")).click();

		Set<String> ids = driver.getWindowHandles();
		Iterator<String> s = ids.iterator();
		String parentId = s.next();
		String ChildId = s.next();
		
		driver.switchTo().window(ChildId);
		
		System.out.println(driver.getTitle());
	
		
		
		
			
			
		}
		
	

		
	}

