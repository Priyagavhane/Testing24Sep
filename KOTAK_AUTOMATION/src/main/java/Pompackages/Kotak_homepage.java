package Pompackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Kotak_homepage {
	
	private WebDriverWait wait;

	private Actions act;
	
	@FindBy (xpath = "(//a[@class='dropdown-toggle'])[2]")
	private WebElement exploreProduct;
	
	@FindBy(xpath = "(//a[text()='Loans'])[3]")
	private WebElement loans;
	
	@FindBy(xpath = "(//a[text()='Home Loan'])[3]")
	private WebElement HomeLoans;
	
	@FindBy (xpath = "(//a[text()='Insurance'])[2]")
	private WebElement Insurance;
	
	@FindBy (xpath = "(//a[text()='Life Insurance'])[2]")
	private WebElement LifeInsurance;
	
	@FindBy (xpath = "(//a[@class='dropdown-toggle'])[4]")
	private WebElement Makepayments;
	
	@FindBy (xpath = "(//a[text()='Loan / Card Payment'])[3]")
	private WebElement LoanCardpayment;
	
	@FindBy (xpath = "(//a[text()='Credit Card Bill Payment'])[3]")
	private WebElement CreditCardBillpayment;
	
	@FindBy (xpath = "(//li[@class='menu-sublinks-track active'])[3]")
	private WebElement MoneyTransferForex;
	
	@FindBy (xpath = "(//a[text()='Send money abroad'])[3]")
	private WebElement SendMoneyAbroad;
	
	
	//constructor
	
	public  Kotak_homepage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);   
		act = new Actions(driver);
		wait = new WebDriverWait(driver,10);
	}
	
	public void mouseActiononExploreProduct()
	{
	   wait.until(ExpectedConditions.visibilityOf(exploreProduct));
	   act.moveToElement(exploreProduct).build().perform();
	}
		
	public void mouseActiononloans()
	{
	   wait.until(ExpectedConditions.visibilityOf(loans));
	   act.moveToElement(loans).build().perform();
	}
	
	public void mouseActiononHomeLoans()
	{
	   wait.until(ExpectedConditions.visibilityOf(HomeLoans));
       act.moveToElement(HomeLoans).build().perform();
	   HomeLoans.click();
	}
	public void mouseActionInsurance()
	{
	   wait.until(ExpectedConditions.visibilityOf(Insurance));
	   act.moveToElement(Insurance).build().perform();
	}
	public void mouseActionLifeInsurance()
	{
	   wait.until(ExpectedConditions.visibilityOf(LifeInsurance));
	   act.moveToElement(LifeInsurance).build().perform();
	   LifeInsurance.click();
	}	
	public void mouseActiononMakepayments()
	{
		wait.until(ExpectedConditions.visibilityOf(Makepayments));
		act.moveToElement(Makepayments).build().perform();		
	}
	public void mouseActiononLoanCardpayment()
	{
		wait.until(ExpectedConditions.visibilityOf(LoanCardpayment));
		act.moveToElement(LoanCardpayment).build().perform();
	}
	public void mouseActiononCreditCardBillpayment()
	{
		wait.until(ExpectedConditions.visibilityOf(CreditCardBillpayment));
		act.moveToElement(CreditCardBillpayment).build().perform();
		CreditCardBillpayment.click();
	}
	public void mouseActionMoneyTransferForex()
	{
	    wait.until(ExpectedConditions.visibilityOf(MoneyTransferForex));
	    act.moveToElement(MoneyTransferForex).build().perform();
	}
	public void mouseActionSendMoneyAbroad()
	{
	   wait.until(ExpectedConditions.visibilityOf(SendMoneyAbroad));
	   act.moveToElement(SendMoneyAbroad).build().perform();
	   SendMoneyAbroad.click();
	}
}

	
	
	
	
	

