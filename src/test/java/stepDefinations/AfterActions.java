package stepDefinations;
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import Utils.Log;
import Utils.DriverManager;
public class AfterActions {

	
	@After
    public static void tearDown(Scenario scenario) {
    	WebDriver driver=DriverManager.getDriver();
    	Log.info("Scenario "+scenario.getName()+" is"+ scenario.isFailed());
    	 if (scenario.isFailed()) {
             byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
             scenario.embed(screenshotBytes, "image/png");
         }else{
        	 Log.info("Scenario "+scenario.getName()+" is Pass");
         }
    	 DriverManager.tearDown();
    }
	
	
}
