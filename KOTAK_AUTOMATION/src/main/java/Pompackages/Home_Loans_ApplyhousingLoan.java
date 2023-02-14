package Pompackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Loans_ApplyhousingLoan {

	private WebDriver driver;
	private Actions act ;
	private WebDriverWait wait;
	
	@FindBy(xpath = "(//a[@data-toggle='modal'])[26]")
	private WebElement CalculateEMI;
	
    public Home_Loans_ApplyhousingLoan(WebDriver driver) 
    {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver,15);
		act = new Actions(driver);
	}
    
    //method
    
    public void clickonCalculateEMI()
    {
    	wait.until(ExpectedConditions.visibilityOf(CalculateEMI));
    	CalculateEMI.click();
    }
    public void WaituntilCalculateEMI()
    {
    	wait.until(ExpectedConditions.visibilityOf(CalculateEMI));
    }
	
}
