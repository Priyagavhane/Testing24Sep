package Testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pompackages.Apply_For_Life_Insurance;
import Pompackages.Kotak_homepage;
import Pompackages.Life_Insurance_ApplyPolicy;

public class ApplyForLifeInsurance {

	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\OneDrive\\Desktop\\Velocity Testing\\Automation Notes\\selenium\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();		
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		  driver.manage().window().maximize();		
		  driver.get("https://www.kotak.com/");
		  
		  Kotak_homepage kotak_homepage = new Kotak_homepage (driver);
		  	  
		  kotak_homepage.mouseActiononExploreProduct();
		   
		  Thread.sleep(1000);
		  
		  kotak_homepage.mouseActionInsurance();
		  
		  kotak_homepage.mouseActionLifeInsurance();
		 	 	  
		  Life_Insurance_ApplyPolicy life_Insurance_ApplyPolicy = new Life_Insurance_ApplyPolicy(driver);
	
		  life_Insurance_ApplyPolicy.clickonApplyNowButton();
		  
		  Apply_For_Life_Insurance apply_For_Life_Insurance = new Apply_For_Life_Insurance(driver);
		  
		  String Text = apply_For_Life_Insurance.getTextMessage();
		  
		  if (Text.equals("Please leave your details and we will get in touch with you."))
		  {
			  System.out.println("text is valid");
		  }
		  else
		  {
			 System.out.println("text is not valid ");
		  }
		  Thread.sleep(2000);
		  
		  apply_For_Life_Insurance.Name("nnnn");
		  Thread.sleep(2000);
		  
		  apply_For_Life_Insurance.MobileNumber("7877878787");
		  Thread.sleep(2000);

		  apply_For_Life_Insurance.Email("priya@gmail");
		  Thread.sleep(2000);

		  apply_For_Life_Insurance.City("pune");
		  Thread.sleep(2000);

		  apply_For_Life_Insurance.CRNOptional("optional");
		  Thread.sleep(2000);

		  apply_For_Life_Insurance.clickoncheckbox();
		  Thread.sleep(2000);

		  apply_For_Life_Insurance.clickonApplyNowButton();	
		  Thread.sleep(2000);		
	}
}
