package Barbbler.AutomationExcercise;
import Barbbler.AutomationExcercise.Base;
import Barbbler.AutomationExcercise.LoginPage;

import org.testng.annotations.*;
public class LogoutTest extends Base{
	
   @Test
    public void testUntitled() 
   {
       LoginPage.testLogin();
	   LogoutPage.testLogoutScreen();
       
    }

    
}