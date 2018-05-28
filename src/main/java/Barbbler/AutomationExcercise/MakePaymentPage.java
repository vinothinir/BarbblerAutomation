package Barbbler.AutomationExcercise;
import Barbbler.AutomationExcercise.Base;
import Barbbler.AutomationExcercise.Data;
import Barbbler.AutomationExcercise.LoginPage.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MakePaymentPage extends Base{
	
	private static final String MakePaymentButton="//*[@text='Make Payment']";
	private static final String PhoneText="//*[@id='phoneTextField']";
	private static final String NameText="//*[@id='nameTextField']";
	private static final String AmountText="//*[@id='amountTextField']";
	//private static final String CountryText="//*[@id='countryTextField']";
	private static final String SelectButton="//*[@text='Select']";
	private static final String SendPaymentButton="//*[@text='Send Payment']";
	private static final String ConfirmButton= "//*[@text='Yes']";
	private static final String CancelButton= "//*[@text='Cancel']";
	PageObjects makepaymentpage;
	 public MakePaymentPage() {
	        super();
	       makepaymentpage = new PageObjects();
	        PageFactory.initElements(driver, makepaymentpage);
	    }
  
    public  void testPaymentScreen() {
    	makepaymentpage.MakePaymentFld.click();
        makepaymentpage.NameFld.sendKeys(Data.inputdata.Name);
        makepaymentpage.phoneField.sendKeys(Data.inputdata.Phone);
        makepaymentpage.amountField.sendKeys(Data.inputdata.Amount);
        driver.executeScript("seetest:client.swipeWhileNotFound(\"Down\", 350, 2000, \"NATIVE\", \"//*[@text='Germany']\", 0, 1000, 5, true)");
        makepaymentpage.sendpaymentBtn.click();
        System.out.println("TestPass: Payment done successfully");
        }
    public  void CancelPaymentScreen() {
    	makepaymentpage.MakePaymentFld.click();
        makepaymentpage.NameFld.sendKeys(Data.inputdata.Name);
        makepaymentpage.phoneField.sendKeys(Data.inputdata.Phone);
        makepaymentpage.amountField.sendKeys(Data.inputdata.Amount);
        driver.executeScript("seetest:client.swipeWhileNotFound(\"Down\", 350, 2000, \"NATIVE\", \"//*[@text='Germany']\", 0, 1000, 5, true)");
        makepaymentpage.cancelBtn.click();
        System.out.println("TestPass: Payment cancelled without any issues");
        }

    class PageObjects {
    	@CacheLookup
        @FindBy(name = "Make Payment")
        public WebElement MakePaymentFld;


        @CacheLookup
        @FindBy(id = "nameTextField")
        public WebElement NameFld;

        @CacheLookup
        @FindBy(id = "phoneTextField")
        public WebElement phoneField;
        
        @CacheLookup
        @FindBy(id = "amountTextField")
        public WebElement amountField;

        @CacheLookup
        @FindBy(name = "Select")
        public WebElement selectBtn;
        @CacheLookup
        @FindBy(name = "Send Payment")
        public WebElement sendpaymentBtn;
        @CacheLookup
        @FindBy(name = "Cancel")
        public WebElement cancelBtn;
       


    }

}