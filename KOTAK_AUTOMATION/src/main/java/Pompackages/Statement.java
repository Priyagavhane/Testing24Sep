package Pompackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Statement {
	
	
	@FindBy(xpath = "//h4[text()='View and Pay Credit Card bill online']")
	private WebElement text;
	
	@FindBy(xpath = "//input[@id='mat-input-0']")
	private WebElement  RegisteredMobileno;
	
	@FindBy(xpath = "(//div[@class='mat-form-field-flex'])[2]")
	private WebElement  calender;
	
	@FindBy(xpath = "//div[text()='1']")
	private WebElement Date;
	
	@FindBy(xpath = "//button[text()='Send OTP']")
	private WebElement SendOTP;
	
	public  Statement (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		  
	}
	public String getTextmessage()
	{
		String Text = text.getText();
		System.out.println("text");
		return Text;
	}
	public void enterRegisteredMobileno(String num)
	{
		RegisteredMobileno.sendKeys(num);
	}
	public void clickoncalender()
	{
		calender.click();
	}
	public void clickonDate()
	{
		Date.click();
	}
	public void clickonSendOTP()
	{
		SendOTP.click();
	}

}
