package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	
	private By usernameText = By.id("username");
	private By passwordText = By.id("password");
	private By loginButton    = By.name("login");

	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	public void enterUsername(String username) {
		
		driver.findElement(usernameText).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		
		driver.findElement(passwordText).sendKeys(password);
	}

	public void ClickLogin() {
	
	driver.findElement(loginButton).click();
}
	

}
