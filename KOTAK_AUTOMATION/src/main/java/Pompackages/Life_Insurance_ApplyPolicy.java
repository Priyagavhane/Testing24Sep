package Pompackages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Life_Insurance_ApplyPolicy {

    //variables
	
	@FindBy (xpath = "(//a[text()='Apply Now'])[2]")
	private WebElement ApplyNowButton;
	
	
	//constructor
	
	public  Life_Insurance_ApplyPolicy (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods
	
	public void clickonApplyNowButton() {
		ApplyNowButton.click();
	}
	
}
