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

public class BrokenLinksDemo01 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int linksCount = links.size();

		for (int i = 0; i < linksCount; i++) {

			String url= links.get(i).getAttribute("href");
			URL urls = new URL(url);
			HttpURLConnection connection=(HttpURLConnection) urls.openConnection();
			connection.connect();
			
			String response = connection.getResponseMessage();
			System.out.println(links.get(i).getAttribute("href")+ "-------------->"+ response);
			
		}

	}

}
