package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	private WebDriver driver;
	
	
	// Page Factory method
	@FindBy(id="username")
	WebElement usernameText;
	
	@FindBy(id="password")
	WebElement passwordText;
	
	@FindBy(name="login")
	WebElement loginButton;
	
	
	
	
//	private By usernameText = By.id("username");
//	private By passwordText = By.id("password");
//	private By loginButton    = By.name("login");

	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void enterUsername(String username) {
		
		usernameText.sendKeys(username);
//		driver.findElement(usernameText).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		
		passwordText.sendKeys(password);
		// driver.findElement(passwordText).sendKeys(password);
	}

	public void ClickLogin() {
	
		loginButton.click();
	// driver.findElement(loginButton).click();
}
	

}
