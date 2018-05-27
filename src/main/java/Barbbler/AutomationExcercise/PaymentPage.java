package Barbbler.AutomationExcercise;
import Barbbler.AutomationExcercise.Base;
import Barbbler.AutomationExcercise.Data;
import org.openqa.selenium.By;

public class PaymentPage extends Base{
	
	private static final String MakePaymentButton="//*[@text='Make Payment']";
	private static final String MortgageButton = "//*[@text='Mortgage Request']";
	private static final String ExpenseButton = "//*[@text='Expense Report']";
	private static final String LogoutButton="//*[@text='Logout']";
	static String button1,button2,button3,button4;
   
    public static void testPaymentScreen() {
        button1=driver.findElement(By.xpath(MakePaymentButton)).getText();
        button2=driver.findElement(By.xpath(MortgageButton)).getText();
        button3=driver.findElement(By.xpath(ExpenseButton)).getText();
        button4=driver.findElement(By.xpath(LogoutButton)).getText();
        
        if(button1.equals("Make Payment")){
        	System.out.println("Button1 is found and correct text is displayed");
        }
        if(button2.equals("Mortgage Request")){
        	System.out.println("Button2 is found and correct text is displayed");
        }
        if(button3.equals("Expense Report")){
        	System.out.println("Button3 is found and correct text is displayed");
        }
        if(button4.equals("Logout")){
        	System.out.println("Button4 is found and correct text is displayed");
        }
        System.out.println("TestPass: Payment screen is displayed with all required objects");
    }

    
}