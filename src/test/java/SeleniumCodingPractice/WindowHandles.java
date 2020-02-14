package SeleniumCodingPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		
		Set<String> s=driver.getWindowHandles();
		Iterator<String>ids=s.iterator();
		/*String parentId= ids.next();
		String childId= ids.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		driver.quit();*/
		
		while(ids.hasNext()) {
			
			String myId=ids.next();
			if(driver.switchTo().window(myId).getTitle().equalsIgnoreCase("Google Account Help")) {
				
				System.out.println(driver.getTitle());
				driver.quit();
			}
			
			
		}
		
		
	}
	
	

}
