package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityKotak {
	
	public void captureScreenshot(String methodname,WebDriver driver)throws IOException{
		Date date = new Date ();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String filename = date.toString().replace(":", "");
		File dest = new File ("C:\\Users\\priya\\OneDrive\\Desktop\\Velocity Testing\\Automation Notes\\selenium\\imgpath\\Test"+methodname+""+filename+".jpg");
	    FileHandler.copy(src, dest);
		}
		
		public static String fetchDataFromExcel(String sheetName ,int row,int cell) throws EncryptedDocumentException, IOException {
			  String path = "C:\\Users\\priya\\OneDrive\\Desktop\\Data.xlsx";
				InputStream File = new FileInputStream(path);
				Workbook workbook = WorkbookFactory.create(File) ;
				Sheet sheet = workbook.getSheet(sheetName);
			    
				Row row1 = sheet.getRow(row);
				Cell cell1 = row1.getCell(cell);
				String value;
				try 
				{
				  value = cell1.getStringCellValue();
				  System.out.println(value);
			    }
				catch(IllegalStateException e) 
				{
			      double data = cell1.getNumericCellValue();
			      value = Double.toString(data);
			      System.out.println(value);
				}
					
				return value ;
		}

}
