package Barbbler.AutomationExcercise;
import Barbbler.AutomationExcercise.Base;
import Barbbler.AutomationExcercise.Data;
import Barbbler.AutomationExcercise.LoginPage.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage extends Base{
	PageObjects logoutpage;
	 public LogoutPage() {
	        super();
	        logoutpage = new PageObjects();
	        PageFactory.initElements(driver, logoutpage);
	    }
    public void testLogoutScreen() {
       if(logoutpage.logoutBtn.isDisplayed()){
    	   System.out.println("Logout button is displayed");
    	   logoutpage.logoutBtn.click();
    	   System.out.println("Logged out from application successfully");
       }
       
        
    }

    class PageObjects {

        @CacheLookup
        @FindBy(name = "Logout")
        public WebElement logoutBtn;



    }
}