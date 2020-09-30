package stepDefinations;
import org.apache.commons.logging.Log;

import Utils.DriverManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageActions.LoginPageActions;
import pageActions.AccountSummaryPageActions;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class testStepDefs {
	Scenario scenario;
	LoginPageActions LoginPageActions =new LoginPageActions();
	AccountSummaryPageActions AccountSummaryPageActions =new AccountSummaryPageActions();
	
	 @Given("^open \"([^\"]*)\" successfully$")
	    public void jawwytv_site_something_opens_successfully(String url){
		 DriverManager.openApplication(url);
	    }

	 @Then("^User enters username password and clicks signin button$")
	 public void user_enters_username_password_and_clicks_signin_button() throws Throwable {
		 LoginPageActions.login();
	 }
	 
	 @Then("^User lands on Account summary page$")
	 public void user_lands_on_Account_summary_page() throws Throwable {
		 AccountSummaryPageActions.ValidatePageTitle();
	 }

	 @Then("^User logout successfully$")
	 public void user_logout_successfully() throws Throwable {
		 LoginPageActions.logout();
	 }

	 
}
