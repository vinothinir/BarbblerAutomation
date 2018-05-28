package Barbbler.AutomationExcercise;

import java.net.MalformedURLException;
import Barbbler.AutomationExcercise.Data;
import java.net.URL;
import java.util.logging.Level;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base 
{
	private String reportDirectory = "reports"; 
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected static AndroidDriver<AndroidElement> driver = null;
	DesiredCapabilities dc = new DesiredCapabilities();
	 @BeforeMethod
	    public void setUp() throws MalformedURLException {
	        dc.setCapability("reportDirectory", reportDirectory);
	        dc.setCapability("reportFormat", reportFormat);
	        dc.setCapability("testName", testName);
	        dc.setCapability(MobileCapabilityType.UDID, Data.inputdata.DeviceUDID);
	        System.out.println("DeviceUDID"+ Data.inputdata.DeviceUDID);
	        try{
	        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
	        System.out.println(driver);
	        }
	        catch(Exception e){
	        	System.out.println(e.getMessage());
	        	System.out.println("Initiating Driver error");
	        }
	        driver.setLogLevel(Level.INFO);
	    }
	 public AndroidDriver<AndroidElement> getDriver(){
	        return driver;
	    }
	 
	 @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
}
