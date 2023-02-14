package Testpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pompackages.Home_Loans_ApplyhousingLoan;
import Pompackages.Home_Loans_EMI_calculator;
import Pompackages.Kotak_homepage;


public class ApplyforHomeloans {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\OneDrive\\Desktop\\Velocity Testing\\Automation Notes\\selenium\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();		
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);		
		  driver.manage().window().maximize();		
		  driver.get("https://www.kotak.com/");
		  
		  Kotak_homepage kotak_homepage = new Kotak_homepage(driver);
		  kotak_homepage.mouseActiononExploreProduct();
		  Thread.sleep(1000);

		  kotak_homepage.mouseActiononloans();
		  kotak_homepage.mouseActiononHomeLoans();
		  Thread.sleep(1000);
		    
		  Home_Loans_ApplyhousingLoan home_Loans_ApplyhousingLoan = new Home_Loans_ApplyhousingLoan(driver);
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		//  js.executeScript("window.scrollBy(0,1500)");
		  Thread.sleep(2000);
		  home_Loans_ApplyhousingLoan.clickonCalculateEMI();
		  
		  Home_Loans_EMI_calculator home_Loans_EMI_calculator = new Home_Loans_EMI_calculator(driver);
		  home_Loans_EMI_calculator.cleartheloanrequirment();
		  home_Loans_EMI_calculator.cleartheInterestRate();
		  home_Loans_EMI_calculator.cleartheYearsinreturn();
		  
		  home_Loans_EMI_calculator.sendloanrequirment();
		  home_Loans_EMI_calculator.sendInterestRate();
		 		  
	}

}
