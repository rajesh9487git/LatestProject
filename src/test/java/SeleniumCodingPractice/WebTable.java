package SeleniumCodingPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		String text="";
		
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		List<WebElement> values=driver.findElements(By.xpath("//div[@id='leftcontainer']/table/tbody/tr"));
		int size=values.size();
		System.out.println(size);
		
		/*for(int i=0;i<size;i++) {
			
			text= values.get(i).getText();
			System.out.println(text);
		}*/
		
		List<WebElement> col= driver.findElements(By.xpath("//div[@id='leftcontainer']/table/thead/tr/th"));
		int colSize=col.size();
		System.out.println(colSize);
		
		String thirdRowText = driver.findElement(By.xpath("//div[@id='leftcontainer']/table/tbody/tr[3]/td[3]")).getText();
		System.out.println(thirdRowText);
		
}

}
