package pageObjects;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class LoginPageLocators {
	
	@FindBy(how=How.ID,using="user_login") public WebElement user_login;
	@FindBy(how=How.ID,using="user_password") public WebElement user_password;
	@FindBy(how=How.XPATH,using="//*[@id=\"login_form\"]/div[2]/input") public WebElement signin_button;
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"settingsBox\"]/ul/li[3]/a") public WebElement username_dropdown;
	@FindBy(how=How.XPATH,using="//*[@id=\"logout_link\"]") public WebElement logout;
	
	
	
}
