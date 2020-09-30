package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AccountSummaryPageLocators {

	@FindBy(how=How.XPATH,using="//*[@id=\"account_summary_tab\"]/a") public WebElement account_summary_tab;
	
}
