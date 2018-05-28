package Barbbler.AutomationExcercise;
import Barbbler.AutomationExcercise.Base;
import Barbbler.AutomationExcercise.LoginPage;

import org.testng.annotations.*;
public class LoginScreenTest extends Base{
	
   @Test
    public void testUntitled() {
       LoginPage login=new LoginPage();
       login.testLogin();
       
    }

    
}