package tests;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;
import Utils.Log;

public class LoginTest extends BaseTest {
	
	
	@Test
	public void testValidLogin() {
		        Log.info("Starting the login test");
		        LoginPage loginPage = new LoginPage(driver);
		        loginPage.enterUsername("roomtest1@simplertrading.com");
		        loginPage.enterPassword("4IW6i8vINHxWD@1upABBOqxG");
		        loginPage.ClickLogin();
		        System.out.println(driver.getTitle());
		        Log.info("Verifying the page title" );
		    }
}


