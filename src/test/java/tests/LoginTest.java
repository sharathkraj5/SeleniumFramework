package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;

public class LoginTest extends BaseTest {
	
	
	@Test
	public void testValidLogin() {
		
		        LoginPage loginPage = new LoginPage(driver);
		        loginPage.enterUsername("roomtest1@simplertrading.com");
		        loginPage.enterPassword("4IW6i8vINHxWD@1upABBOqxG");
		        loginPage.ClickLogin();
		        System.out.println(driver.getTitle());
		    }
}


