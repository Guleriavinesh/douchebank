package douchebank1;

import org.apache.hc.core5.util.Asserts;
import org.checkerframework.framework.qual.TargetLocations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.sun.tools.javac.util.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class quality {
	protected static RemoteWebDriver driver = null;

	
	public static RemoteWebDriver launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		// driver.get("https://www.google.co.in/");
		return driver;
	}

	public void clickonhyprlink() throws InterruptedException {
		driver.get("https://www.epfindia.gov.in/site_en/For_Employees.php");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a[@href=\"https://unifiedportal-mem.epfindia.gov.in/memberinterface/\"]"))
				.click();
		Thread.sleep(10000);
		driver.switchTo().parentFrame();
		System.out.println("heeloo");
		// driver.navigate().back();
		String title = driver.getTitle();
		String vinesh = "vinesh";
		

	}
	
	

}
