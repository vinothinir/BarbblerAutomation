package Barbbler.AutomationExcercise;
import Barbbler.AutomationExcercise.Base;
import Barbbler.AutomationExcercise.LoginPage;

import org.testng.annotations.*;
public class CancelPaymentTest extends Base{
	
   @Test
    public void testUntitled() 
   {
       LoginPage.testLogin();
	   MakePaymentPage.CancelPaymentScreen();
	  
       
    }

    
}