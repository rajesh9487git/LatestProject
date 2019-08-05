package Academy;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//give me the count of links in the footer section

public class MiniDriver {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice");

		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		WebElement columnDriver = footerDriver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]"));

		//columnDriver.findElements(By.tagName("a")).size();

		for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {

			String clickonLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonLinkTab);
			Thread.sleep(3000L);

		}

		Set<String> abc = driver.getWindowHandles();
		Iterator<String> xyz = abc.iterator();

		while (xyz.hasNext()) {

			System.out.println(driver.switchTo().window(xyz.next()).getTitle());
		}

	}

}
