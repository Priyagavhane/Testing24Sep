package TestNGPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;
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

import Pompackages.Kotak_homepage;
import Pompackages.OpenZeroBalanceSavingAccount;
import Pompackages.SendMoneyAbroad;
import Pompackages.Statement;

public class VerifyCreditcardandSendmoneypage {
	
	private WebDriver driver;
	private Kotak_homepage kotak_homepage;
	private Statement statement;
	private SendMoneyAbroad sendMoneyAbroad;
	private OpenZeroBalanceSavingAccount openZeroBalanceSavingAccount;
	
	
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
		statement = new Statement(driver);
		sendMoneyAbroad = new SendMoneyAbroad(driver);
		openZeroBalanceSavingAccount = new OpenZeroBalanceSavingAccount(driver);
	}
	@BeforeMethod
	public void getwindow()
	{
		driver.get("https://www.kotak.com/");
		kotak_homepage.mouseActiononMakepayments();
	}
	@Test
	public void ApplyForCreditCardbillpayment() throws InterruptedException
	{
		  kotak_homepage.mouseActiononLoanCardpayment();
		  Thread.sleep(2000);
		  kotak_homepage.mouseActiononCreditCardBillpayment();
		 
		  String actualresult = statement.getTextmessage();
		  String expectedresult = "View and Pay Credit Card bill online";
		  Assert.assertEquals(actualresult, expectedresult);
		  
		  statement.enterRegisteredMobileno("7066780877");
		  statement.clickoncalender();
		  statement.clickonDate();
		  statement.clickonSendOTP();
	}
	@Test
	public void ApplyforSendmoneyAbroad() throws InterruptedException
	{
		  kotak_homepage.mouseActionMoneyTransferForex();
		  Thread.sleep(2000);
		  kotak_homepage.mouseActionSendMoneyAbroad();
		  
		  sendMoneyAbroad.clickonNewCustomer();
		  openZeroBalanceSavingAccount.enterMobileno("706678087");
		  openZeroBalanceSavingAccount.enterMobileno("priyankagavhane82@gmail.com");
		  openZeroBalanceSavingAccount.enterPinCode("888888");
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
		statement = null;
		sendMoneyAbroad = null;
		openZeroBalanceSavingAccount = null;	
	}
	@AfterTest
	public void closethebrowser()
	{
		driver.quit();
	}

}
