package Academy;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksAgainnAgain {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> links =driver.findElements(By.tagName("a"));
		int linksSize=links.size();
		for(int i=0; i<linksSize;i++) {
			
			URL urls= new URL(links.get(i).getAttribute("href"));
			
			HttpURLConnection connection=(HttpURLConnection)urls.openConnection();
			connection.connect();
			String msg = connection.getResponseMessage();
			System.out.println(msg);
			connection.disconnect();
			
		}
		

	}

}
