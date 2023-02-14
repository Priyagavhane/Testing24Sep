package Pompackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenZeroBalanceSavingAccount {
	
	@FindBy(xpath = "//input[@id='input-with-sx']")
	private WebElement Mobileno;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement EmailId;
	
	@FindBy(xpath = "//input[@id='pincode']")
	private WebElement PinCode;
	
	public  OpenZeroBalanceSavingAccount (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		  
	}
	public void enterMobileno(String num)
	{
		Mobileno.sendKeys(num);
	}
	public void enterEmailId(String text)
	{
		EmailId.sendKeys(text);
	}
	public void enterPinCode(String num)
	{
		PinCode.sendKeys(num);
	}
	
	
	

}
