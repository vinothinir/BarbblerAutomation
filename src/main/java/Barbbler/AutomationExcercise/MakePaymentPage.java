package Barbbler.AutomationExcercise;
import Barbbler.AutomationExcercise.Base;
import Barbbler.AutomationExcercise.Data;
import org.openqa.selenium.By;

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
   
    public static void testPaymentScreen() {
        driver.findElement(By.xpath(MakePaymentButton)).click();
        driver.findElement(By.xpath(PhoneText)).sendKeys(Data.inputdata.Phone); 
        driver.findElement(By.xpath(NameText)).sendKeys(Data.inputdata.Name); 
        driver.findElement(By.xpath(AmountText)).sendKeys(Data.inputdata.Amount);
        driver.findElement(By.xpath(SelectButton)).click();
        driver.executeScript("seetest:client.swipeWhileNotFound(\"Down\", 350, 2000, \"NATIVE\", \"//*[@text='Germany']\", 0, 1000, 5, true)");
        driver.findElement(By.xpath(SendPaymentButton)).click();
        driver.findElement(By.xpath(ConfirmButton)).click();
        System.out.println("TestPass: Payment done successfully");
        }
    public static void CancelPaymentScreen() {
        driver.findElement(By.xpath(MakePaymentButton)).click();
        driver.findElement(By.xpath(PhoneText)).sendKeys(Data.inputdata.Phone); 
        driver.findElement(By.xpath(NameText)).sendKeys(Data.inputdata.Name); 
        driver.findElement(By.xpath(AmountText)).sendKeys(Data.inputdata.Amount);
        driver.findElement(By.xpath(SelectButton)).click();
        driver.executeScript("seetest:client.swipeWhileNotFound(\"Down\", 350, 2000, \"NATIVE\", \"//*[@text='Germany']\", 0, 1000, 5, true)");
        driver.findElement(By.xpath(CancelButton)).click();
        System.out.println("TestPass: Payment cancelled without any issues");
        }

    
}