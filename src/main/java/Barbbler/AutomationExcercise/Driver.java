package Barbbler.AutomationExcercise;
import io.appium.java_client.android.AndroidDriver;



	public class Driver extends Base{

	    protected AndroidDriver driver;

	    public Driver() {
	        this.driver = super.getDriver();
	    }
	}