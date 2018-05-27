package Barbbler.AutomationExcercise;
import Barbbler.AutomationExcercise.Base;
import Barbbler.AutomationExcercise.Data;
import org.openqa.selenium.By;

public class LogoutPage extends Base{
	
	
	private static final String LogoutButton="//*[@text='Logout']";
	static String button4;
   
    public static void testLogoutScreen() {
       
        button4=driver.findElement(By.xpath(LogoutButton)).getText();
        if (button4.equals("Logout")){
        	driver.findElement(By.xpath(LogoutButton)).click();
        	System.out.println("Test Pass: Logged out from application successfully");
        }
        
    }

    
}