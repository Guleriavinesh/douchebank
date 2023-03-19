package douchebank;

import java.awt.Robot;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import douchebank1.quality;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 extends quality {

	
	  public void fistclass() throws InterruptedException { launchbrowser();
	  
	  WebDriverManager.chromedriver().setup(); RemoteWebDriver driver= new
	  ChromeDriver(); driver.get("https://www.google.co.in/");
	  
	  }
	 
	
@Test
	public void verifyLogo() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.epfindia.gov.in/site_en/index.php");
		
		
		// driver.switchTo().parentFrame();
		/*
		 * String parentwindow= driver.getWindowHandle(); Set<String>
		 * otherwindow=driver.getWindowHandles(); driver.findElement(By.xpath(
		 * "//a[@href=\"https://unifiedportal-mem.epfindia.gov.in/memberinterface/\"]"))
		 * .click(); Thread.sleep(10000); driver.switchTo().window(parentwindow);
		 * driver.findElement(By.xpath("//a[@title='Misc.']")).click();
		 * System.out.println("heeloo"); Iterator<String> t= otherwindow.iterator();
		 * 
		 * if(!parentwindow.equals(otherwindow)) { String otherwindow1=t.next();
		 * 
		 * driver.switchTo().window(otherwindow1);
		 * 
		 * System.out.println(driver.switchTo().window(otherwindow1).getTitle());
		 * 
		 * driver.close(); //driver.switchTo().newWindow(otherwindow); //
		 * driver.navigate().back(); String title = driver.getTitle(); String vinesh =
		 * "EPFO || For Employees";
		 */
//		System.out.println("working");
//		// Actions a= new Actions(driver);
//		System.out.println("working21");
//		WebElement dd = driver.findElement(By.xpath("//a[@title=\"Our Services\"]"));
//		dd.click();
//		Select ab = new Select(dd);
//		Thread.sleep(1000);
//		// a.moveToElement(dd);
//		System.out.println("working31");
//		// a.build().perform();
//
//		System.out.println("working4");
//		ab.selectByIndex(1);
//		System.out.println("working5");
//
//	}
//
//	public void quit() {
//		driver.quit();
//
//	}

//	@Test
//	public void selectest() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("file:///C:/Users/Lenovo%20%20Pc/Desktop/dropdown1.html");
//		WebElement dd = driver.findElement(By.xpath("//select[@name=\'dropdown\12']"));
//
//		Actions a = new Actions(driver);
//		a.moveToElement(dd);
//		dd.click();
//		Select ab = new Select(dd);
//
//		System.out.println("working31");
//		ab.selectByIndex(1);
//		System.out.println("working5");
//
//	}
//	@Test
//	public void prntwi() throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://www.epfindia.gov.in/site_en/index.php");
//		String parentwindow= driver.getWindowHandle(); 
//		Set<String> otherwindow=driver.getWindowHandles(); 
//		driver.findElement(By.xpath("//a[@href=\"https://unifiedportal-mem.epfindia.gov.in/memberinterface/\"]")).click(); 
//		Thread.sleep(10000); 
//		driver.switchTo().window(parentwindow);
//		WebElement asas= driver.findElement(By.xpath("//a[@title='Misc.']"));
//		System.out.println("heeloo"); Iterator<String> t= otherwindow.iterator();
//			  
//	}
	}
		
	
	@DataProvider(name="Vinesh")
	public int[][] m234() {
		return new int[][]{{2},{3}};
		
       
	}
	@Test(dataProvider = "Vinesh")
public void t1(Object b) {
	System.out.println(b);

}
}
