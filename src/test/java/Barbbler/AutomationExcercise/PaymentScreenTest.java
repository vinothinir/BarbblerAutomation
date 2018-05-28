package Barbbler.AutomationExcercise;
import Barbbler.AutomationExcercise.Base;
import Barbbler.AutomationExcercise.LoginPage;

import org.testng.annotations.*;
public class PaymentScreenTest extends Base{
	
   @Test
    public void testUntitled() 
   {
       LoginPage l=new LoginPage();
       l.testLogin();
	   PaymentPage p=new PaymentPage();
	   p.testPaymentScreen();
       
    }

    
}