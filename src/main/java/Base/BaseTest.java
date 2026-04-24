package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Utils.Log;

public class BaseTest {
	
	protected WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
		Log.info("Starting the Webdriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Log.info("Navigating the URL");
		driver.get("https://www.simplertrading.com/login");
		
	}
	
	@AfterMethod
	public void teardown() {
		
		if(driver!=null) {
			Log.info("Webdriver closed");
			driver.quit();
		}
		
	}

}
