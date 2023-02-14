package TestNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Pompackages.Apply_For_Life_Insurance;
import Pompackages.Home_Loans_ApplyhousingLoan;
import Pompackages.Home_Loans_EMI_calculator;
import Pompackages.Kotak_homepage;
import Pompackages.Life_Insurance_ApplyPolicy;

public class VerifyHomeLoansandLifeInsurance {
	private WebDriverWait wait;
	private WebDriver driver;
	private Kotak_homepage kotak_homepage;
	private Home_Loans_ApplyhousingLoan home_Loans_ApplyhousingLoan;
	private Home_Loans_EMI_calculator home_Loans_EMI_calculator;
	private Life_Insurance_ApplyPolicy life_Insurance_ApplyPolicy;
	private Apply_For_Life_Insurance apply_For_Life_Insurance;
	
	@Parameters("broswer123")

	@BeforeTest
	public void launchBrowser(String browser)
	{
		if(browser.equals("Chrome"))
		{
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\OneDrive\\Desktop\\Velocity Testing\\Automation Notes\\selenium\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		}
		
//		if(browser.equals("Edge"))
//		{
//		   System.setProperty("webdriver.edge.driver","C:\\Users\\priya\\OneDrive\\Desktop\\Velocity Testing\\Automation Notes\\selenium\\edgedriver_win64\\msedgedriver.exe");
//		   driver = new EdgeDriver();	
//		}
		
		if(browser.equals("Opera"))
		{
		   System.setProperty("webdriver.opera.driver","C:\\Users\\priya\\Downloads\\operadriver_win32 (1)\\operadriver_win32\\operadriver.exe");
		   driver = new OperaDriver();	
		}
		
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		  driver.manage().window().maximize();	
	}
	@BeforeClass
	public void CreatePomobject()
	{
		kotak_homepage = new Kotak_homepage(driver);
		home_Loans_ApplyhousingLoan =new Home_Loans_ApplyhousingLoan(driver);
		home_Loans_EMI_calculator = new Home_Loans_EMI_calculator(driver);
		life_Insurance_ApplyPolicy =new Life_Insurance_ApplyPolicy(driver);
		apply_For_Life_Insurance = new Apply_For_Life_Insurance(driver);
		wait = new WebDriverWait (driver,20);
	}
	@BeforeMethod
	public void getwindow()
	{
		driver.get("https://www.kotak.com/");
	    kotak_homepage.mouseActiononExploreProduct();
	}
	
	@Test
	public void ApplyforHomeloans() throws InterruptedException
	{
		//  kotak_homepage.mouseActiononExploreProduct();
     	  kotak_homepage.mouseActiononloans();
		  Thread.sleep(2000);

		  kotak_homepage.mouseActiononHomeLoans();
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollBy(0,1000)");
		  //js.executeScript("arguments[0].scrollIntoView(true)", "CalculateEMI");
		  
		//  home_Loans_ApplyhousingLoan.WaituntilCalculateEMI();
		  Thread.sleep(2000);
		  home_Loans_ApplyhousingLoan.clickonCalculateEMI();
		  home_Loans_EMI_calculator.cleartheloanrequirment();
		  home_Loans_EMI_calculator.cleartheInterestRate();
		  home_Loans_EMI_calculator.cleartheYearsinreturn();
		  
		  home_Loans_EMI_calculator.sendloanrequirment();
		  home_Loans_EMI_calculator.sendInterestRate();
	}
	
	@Test
	public void ApplyForLifeInsurance() throws InterruptedException
	{	  
		//  kotak_homepage.mouseActiononExploreProduct();
		   
		//  Thread.sleep(1000);
		  
		  kotak_homepage.mouseActionInsurance();
		  
		  kotak_homepage.mouseActionLifeInsurance();
		 	 		
		  life_Insurance_ApplyPolicy.clickonApplyNowButton();
		  
		  Thread.sleep(2000);
		  
//		  String Text = apply_For_Life_Insurance.getTextMessage();
//		  
//		  if (Text.equals("Please leave your details and we will get in touch with you."))
//		  {
//			  System.out.println("text is valid");
//		  }
//		  else
//		  {
//			 System.out.println("text is not valid ");
//		  }
//		  Thread.sleep(2000);
		  
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
	@AfterMethod
	public void returntoHome()
	{
		driver.navigate().back();
	}
	@AfterClass
	public void clearObject()
	{
		kotak_homepage = null;
		home_Loans_ApplyhousingLoan = null;
		home_Loans_EMI_calculator = null;
		life_Insurance_ApplyPolicy = null;
		apply_For_Life_Insurance = null;
		System.gc(); //garbage collector
	}
	@AfterTest
	public void closethebrowser()
	{
		driver.quit();
	}

}
