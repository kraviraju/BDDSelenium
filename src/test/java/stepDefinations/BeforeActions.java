package stepDefinations;
import cucumber.api.java.Before;
import Utils.Log;
import Utils.DriverManager;
public class BeforeActions {

	@Before
    public static void setUp() {
		//ExtentCucumberFormatter.initiateExtentCucumberFormatter();
    	Log.info("Setting up Driver");
    	DriverManager.setUpDriver();
    }
	
}
