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

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("no of links is " + links.size());

		for (int i = 0; i < links.size(); i++) {

			URL urls = new URL(links.get(i).getAttribute("href"));

			HttpURLConnection connection = (HttpURLConnection) urls.openConnection();
			connection.connect();
			String response = connection.getResponseMessage();
			connection.disconnect();

			System.out.println(links.get(i).getAttribute("href") + "----> " + response);
		}

	}

}
