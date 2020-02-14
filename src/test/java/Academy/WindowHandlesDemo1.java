package Academy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesDemo1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(
				"https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@target='_blank']")).click();
		
		Set<String>ids=driver.getWindowHandles();
		Iterator<String>id= ids.iterator();
		/*String parentId=id.next();
		String childId=id.next();
		
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());*/
		
		while(id.hasNext()) {
			
			id.next();
			if(driver.switchTo().window(id.next()).getTitle().equalsIgnoreCase("Google Account Help")) {
				System.out.println(driver.getTitle());
				driver.quit();
			}
		}
		

	}

}
