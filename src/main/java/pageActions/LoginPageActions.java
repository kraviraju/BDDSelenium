package pageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Utils.DriverManager;
import Utils.Log;
import pageObjects.LoginPageLocators;


public class LoginPageActions {
	LoginPageLocators loginPage =null;
	
	//Initializing WebElements using PageFactory
		public LoginPageActions() {
			this.loginPage=new LoginPageLocators();
			PageFactory.initElements(DriverManager.getDriver(), loginPage);
		}
		
	// Login	
		public void login() {
			loginPage.user_login.sendKeys("username");
			loginPage.user_password.sendKeys("password");
			loginPage.signin_button.click();
			Log.info("User logged in");
		}	
		
	// Logout	
		public void logout() {
			loginPage.username_dropdown.click();
			loginPage.logout.click();
			Log.info("User logged out");
		}
}
