package tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;
import Utils.ExcelUtils;
import Utils.Log;

public class LoginTest extends BaseTest {
	
	@DataProvider(name="LoginData")
	public Object[][] getLoginData() throws IOException{
		
		String filePath = System.getProperty("user.dir") + "/testdata/TestData.xlsx";
	    ExcelUtils.loadexcel(filePath, "sheet1");
		int rowCount = ExcelUtils.getRowCount();
		Object[][] data = new Object[rowCount-1][2];
		
		for(int i=1;i<rowCount;i++) {
			data[i-1][0] = ExcelUtils.getcellData(i, 0);
			data[i-1][1] = ExcelUtils.getcellData(i,1);		
			}
		ExcelUtils.closeExcel();
		return data;
	}
	
	@DataProvider(name="LoginData2")
	public Object[][] getData(){
		
		return new Object[][] {
//			{"roomtest1@simplertrading.com","4IW6i8vINHxWD@1upABBOqxG"},
//			{"roomtest2@simplertrading.com","tRqwQj&wZh%V4nN1pl2qCWz6"},
//			{"roomtest3@simplertrading.com","GrGlGx2%Xu)h69H6f%lTZy4c"},
			{"sharathkumar.rajendran+test@c.simplertrading.com","Sharath@123"}
		};
	}
	
	@Test(dataProvider ="LoginData2")
	public void testValidLogin(String Username, String Password) {
		
		        Log.info("Starting the login test");
		        LoginPage loginPage = new LoginPage(driver);
		       //  loginPage.enterUsername("roomtest1@simplertrading.com");
		        loginPage.enterUsername(Username);
		        // loginPage.enterPassword("4IW6i8vINHxWD@1upABBOqxG");
		        loginPage.enterPassword(Password);
		        loginPage.ClickLogin();
		        System.out.println(driver.getTitle());
		        Log.info("Verifying the page title" );
		    }
}


