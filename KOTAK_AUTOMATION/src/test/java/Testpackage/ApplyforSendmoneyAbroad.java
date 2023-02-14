package Testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pompackages.Kotak_homepage;
import Pompackages.OpenZeroBalanceSavingAccount;
import Pompackages.SendMoneyAbroad;

public class ApplyforSendmoneyAbroad {
	

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
		  kotak_homepage.mouseActionMoneyTransferForex();
		  Thread.sleep(2000);
		  kotak_homepage.mouseActionSendMoneyAbroad();
		  
		  SendMoneyAbroad sendMoneyAbroad = new SendMoneyAbroad(driver);
		  sendMoneyAbroad.clickonNewCustomer();
		  
		  OpenZeroBalanceSavingAccount openZeroBalanceSavingAccount = new OpenZeroBalanceSavingAccount(driver);
		  openZeroBalanceSavingAccount.enterMobileno("706678087");
		  openZeroBalanceSavingAccount.enterMobileno("priyankagavhane82@gmail.com");
		  openZeroBalanceSavingAccount.enterPinCode("888888");
		  
	}
}
