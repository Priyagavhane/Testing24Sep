package Pompackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Apply_For_Life_Insurance {
	
	private WebDriver driver;
	private Actions act;
	private WebDriverWait wait;
	
	//variables
	
	//@FindBy (xpath = "(//div[@class='search-result-box clearfix']//p)[1]")
	@FindBy (xpath = "(//div[@class='search-result-box clearfix']//p)[1]123")
	private WebElement LifeInsuranceText;
		
	@FindBy (xpath = "//input[@name='name']")
	private WebElement Name;
	
	@FindBy (xpath = "//input[@name='mobilenumber']")
	private WebElement MobileNumber;
	
	@FindBy (xpath = "//input[@name='email']")
	private WebElement Email;
	
	@FindBy (xpath = "//input[@name='city']")
	private WebElement City;
	
	@FindBy (xpath = "//input[@name='crn']")
	private WebElement CRNOptional;
	
	@FindBy (xpath = "//input[@name='termsandconditions']")
	private WebElement checkbox;
	
	@FindBy (xpath = "//button[@id='submit-1505497767144']")
	private WebElement ApplyNowButton;
	
	//constructor
	
	public Apply_For_Life_Insurance(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
		wait = new WebDriverWait(driver, 10);		
	}
	
	//methods
	
	public String getTextMessage() 
	{   
	    wait.until(ExpectedConditions.visibilityOf(LifeInsuranceText));
		String text = LifeInsuranceText.getText();
		System.out.println(text);
		return text;
	}
	
	public void Name(String text)
	{
		Name.sendKeys(text);
	}
	public void MobileNumber(String num)
	{
		MobileNumber.sendKeys(num);
	}
	public void Email(String text)
	{
		Email.sendKeys(text);
	}
	public void City(String text)
	{
		City.sendKeys(text);
	}
	public void CRNOptional(String text)
	{
		CRNOptional.sendKeys(text);
	}	
	public void clickoncheckbox() {
		checkbox.click();
	}
	
	public void clickonApplyNowButton() {
		ApplyNowButton.click();
	}

}
