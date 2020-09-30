package pageActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import Utils.DriverManager;
import Utils.Log;
import pageObjects.AccountSummaryPageLocators;
import pageObjects.LoginPageLocators;


public class AccountSummaryPageActions {
	AccountSummaryPageLocators accountSummaryPage =null;
	WebDriver driver;
	
	//Initializing WebElements using PageFactory
		public AccountSummaryPageActions() {
			this.accountSummaryPage=new AccountSummaryPageLocators();
			PageFactory.initElements(DriverManager.getDriver(), accountSummaryPage);
			driver=DriverManager.getDriver();
		}
		
	// Login	
		public void ValidatePageTitle() {
			 String expectedTitle = "Zero - Account Summary";
	         String originalTitle = driver.getTitle();
	         Assert.assertEquals(originalTitle, expectedTitle);
	         Reporter.log("ValidatePageTitle", true);
		}	
	
}
