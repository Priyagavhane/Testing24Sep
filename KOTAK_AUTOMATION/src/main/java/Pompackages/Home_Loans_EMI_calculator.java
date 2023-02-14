package Pompackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Loans_EMI_calculator {
	private WebDriver driver;
	private Actions act;
	private WebDriverWait wait;
	
	@FindBy(xpath = "//a[text()='Calculate EMI']")
	private WebElement EMICalculator;
	
	@FindBy(xpath = "//input[@id='amt']")
	private WebElement loanrequirment;
	
	@FindBy(xpath = "//input[@id='per']")
	private WebElement InterestRate;
	
	@FindBy(xpath = "//input[@id='yr']")
	private WebElement Yearsinreturn;
	
	
	public Home_Loans_EMI_calculator(WebDriver driver) 
	
	  {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		act= new Actions(driver);
		wait = new WebDriverWait(driver,10);
	  }
	
	//methods
	public void clickonEMICalculator()
	{
		EMICalculator.click();
	}
	public void cleartheloanrequirment()
	{
		loanrequirment.clear();
	}
	public void cleartheInterestRate()
	{
		InterestRate.clear();
	}
	public void cleartheYearsinreturn()
	{
		Yearsinreturn.clear();
	}
	public void sendloanrequirment()
	{
		loanrequirment.sendKeys("8000000");
	}
	public void sendInterestRate()
	{
		InterestRate.sendKeys("10");
	}
	
	    

	
	

}
