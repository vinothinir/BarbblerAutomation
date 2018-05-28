package Barbbler.AutomationExcercise;
import Barbbler.AutomationExcercise.Base;
import Barbbler.AutomationExcercise.Data;
import Barbbler.AutomationExcercise.LoginPage.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends Base{
		
	PageObjects paymentpage;
	 public PaymentPage() {
	        super();
	        paymentpage = new PageObjects();
	        PageFactory.initElements(driver, paymentpage);
	    }
    public  void testPaymentScreen() {
       if (paymentpage.makepaymentbtn.isDisplayed()){
        	if(paymentpage.MortgateBtn.isDisplayed()){
        		if(paymentpage.ExpenseBtn.isDisplayed()){
        		System.out.println("all objects are displayed correctly");
        		}
        	}
        }
    }
    class PageObjects {

        @CacheLookup
        @FindBy(name = "Make Payment")
        public WebElement makepaymentbtn;

        @CacheLookup
        @FindBy(name = "Mortgage Request")
        public WebElement MortgateBtn;

        @CacheLookup
        @FindBy(name = "Expense Report")
        public WebElement ExpenseBtn;

       


    }


    
}