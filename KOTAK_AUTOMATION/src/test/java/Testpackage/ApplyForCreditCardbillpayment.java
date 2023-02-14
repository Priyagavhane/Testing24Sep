package Testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Pompackages.Kotak_homepage;
import Pompackages.Statement;

public class ApplyForCreditCardbillpayment {
	  
	
	public static void main(String[] args) throws InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\OneDrive\\Desktop\\Velocity Testing\\Automation Notes\\selenium\\chromedriver_win32\\chromedriver.exe");
		  WebDriver  driver = new ChromeDriver();		
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		  driver.manage().window().maximize();		
		  driver.get("https://www.kotak.com/");
		  Thread.sleep(2000);
		  
		  Kotak_homepage kotak_homepage = new Kotak_homepage(driver);
		  kotak_homepage.mouseActiononMakepayments();
		  Thread.sleep(2000);
		  kotak_homepage.mouseActiononLoanCardpayment();
		  Thread.sleep(2000);
		  kotak_homepage.mouseActiononCreditCardBillpayment();
		 
		  Statement statement = new Statement(driver);		  
		  String actualresult = statement.getTextmessage();
		  String expectedresult = "View and Pay Credit Card bill online";
		  Assert.assertEquals(actualresult, expectedresult);
		  
		  statement.enterRegisteredMobileno("7066780877");
		  statement.clickoncalender();
		  statement.clickonDate();
		  statement.clickonSendOTP();
	}
}
