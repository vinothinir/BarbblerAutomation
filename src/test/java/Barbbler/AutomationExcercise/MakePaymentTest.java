package Barbbler.AutomationExcercise;
import Barbbler.AutomationExcercise.Base;
import Barbbler.AutomationExcercise.LoginPage;

import org.testng.annotations.*;
public class MakePaymentTest extends Base{
	
   @Test
    public void testUntitled() 
   {
       LoginPage l=new LoginPage();
       l.testLogin();
	   MakePaymentPage m=new MakePaymentPage();
	   m.testPaymentScreen();
       
    }

    
}