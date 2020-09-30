package Utils;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.WebDriverWait;



import org.openqa.selenium.JavascriptExecutor;

public class DriverManager {
	private static DriverManager DriverManager;
	private static WebDriver driver;
	
	
	private static WebDriverWait waitDriver;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 50;
    
    
    private  DriverManager() {

    	// Chrome Driver 
		    	ChromeOptions chromeOptions;
		    	chromeOptions = new ChromeOptions();
				chromeOptions.setExperimentalOption("useAutomationExtension", false);
				chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
				chromeOptions.addArguments("disable-infobars");
				chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
				String path ="C:\\RaviJAVAProjects\\DRIVERCollection\\chromedriver85.0.4183.87.exe";
				System.out.println("Chrome Driver Path : "+path);
				Log.info("Chrome Driver Path : "+path);
				System.setProperty("webdriver.chrome.driver", path);
				driver = new ChromeDriver(chromeOptions);
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
			    waitDriver = new WebDriverWait(driver, TIMEOUT);
		        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		        String window=driver.getWindowHandle();
		        Log.info("Current Window -> "+window);
		        Log.info("Browser opened! ");
    }
	
    public static void openApplication(String url) {
        driver.get(url);
        Log.info("Application opened : " + url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setUpDriver() {
       if (DriverManager == null)
    	   DriverManager = new DriverManager();
      
    }

    public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
            Log.info("Browser closed! ");
        }
        DriverManager = null;
    }
    public static void waitForPageToLoad()
    {
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    }
    
    //Scroll Down to page
    public static void scrollDown() throws InterruptedException {
    	JavascriptExecutor jse = (JavascriptExecutor)driver;
    	jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    	Thread.sleep(5000);
    	
    }
    
    
}
