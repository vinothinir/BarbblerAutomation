package Barbbler.AutomationExcercise;
import Barbbler.AutomationExcercise.Base;
import Barbbler.AutomationExcercise.Data;
import org.openqa.selenium.By;

public class LoginPage extends Base{
	
	private static final String UserName = "//*[@id='usernameTextField']";
	private static final String Password = "//*[@id='passwordTextField']";
	private static final String Login_Button = "//*[@text='Login']";
   
    public static void testLogin() {
        driver.executeScript("seetest:client.setDevice(\"adb:samsung SM-G920F --RCS DTAG\")");
	   //driver.executeScript("seetest:client.setDevice("+Data.inputdata.DeviceName+\")");
        driver.startActivity("com.experitest.ExperiBank", ".LoginActivity");
        driver.findElement(By.xpath(UserName)).sendKeys(Data.inputdata.UserName);
        driver.findElement(By.xpath(Password)).sendKeys(Data.inputdata.Password);
        driver.findElement(By.xpath(Login_Button)).click();
        if (Data.inputdata.UserName.equals("company")){
        	if (Data.inputdata.Password.equals("company")){
        	System.out.println("LoginScreen Passed");
        }

    }
    }
}

    
