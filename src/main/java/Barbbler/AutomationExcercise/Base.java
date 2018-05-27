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
	        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
	        driver.setLogLevel(Level.INFO);
	    }
	 @AfterMethod
	    public void tearDown() {
	        driver.quit();
	    }
}
