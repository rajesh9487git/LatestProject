package Academy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ToolTip {

	public static void main(String[] args) {

		String ExpectedTooltip = "What's new in 3.2";
		System.setProperty("webdriver.chrome.driver", "C:/seleniumRelatedSoftwares/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/tooltip.html");

		WebElement download = driver.findElement(By.xpath(".//*[@id='download_now']"));

		Actions a = new Actions(driver);
		a.moveToElement(download).build().perform();

		WebElement tooltip = driver.findElement(By.xpath(".//*[@class='box']/div/a"));
		String ActualTooltip = tooltip.getText();

		Assert.assertEquals(ActualTooltip, ExpectedTooltip);

		System.out.println("message verified");

	}

}
