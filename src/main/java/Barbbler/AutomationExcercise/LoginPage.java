package Barbbler.AutomationExcercise;
import Barbbler.AutomationExcercise.Base;
import Barbbler.AutomationExcercise.Data;
import org.openqa.selenium.support.*;
import org.openqa.selenium.*;
import org.openqa.selenium.support.pagefactory.*;

public class LoginPage extends Driver{
	PageObjects loginpage;
	 public LoginPage() {
	        super();
	        loginpage = new PageObjects();
	        PageFactory.initElements(driver, loginpage);
	    }
   
    public   void testLogin() {
    	driver.executeScript("seetest:client.setDevice(\"adb:samsung SM-G920F --RCS DTAG\")");
	   //driver.executeScript("seetest:client.setDevice("+Data.inputdata.DeviceName+\")");
    	driver.startActivity("com.experitest.ExperiBank", ".LoginActivity");
    	if (loginpage.userNameFld.isDisplayed()){
        if(loginpage.passwordField.isDisplayed()){
        	if(loginpage.loginBtn.isDisplayed()){
        		System.out.println("All objects are displayed correctly");
        		loginpage.userNameFld.sendKeys(Data.inputdata.UserName);
        		loginpage.passwordField.sendKeys(Data.inputdata.Password);
        		loginpage.loginBtn.click();
        		System.out.println("Loggined into the application successfully");
        	}
        }

    }
    }
    class PageObjects {

        @CacheLookup
        @FindBy(id = "usernameTextField")
        public WebElement userNameFld;

        @CacheLookup
        @FindBy(id = "passwordTextField")
        public WebElement passwordField;

        @CacheLookup
        @FindBy(name = "Login")
        public WebElement loginBtn;

       


    }

}

    
