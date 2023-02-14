package Pompackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendMoneyAbroad {
	
	@FindBy(xpath = "//a[text()='New Customer']")
    private WebElement NewCustomer;
	
	public  SendMoneyAbroad (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		  
	}
	public void clickonNewCustomer()
	{
		NewCustomer.click();
	}
}


