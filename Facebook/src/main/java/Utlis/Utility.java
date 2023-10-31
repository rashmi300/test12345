package Utlis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {

	public static String getDataromExcelSheet(String filepath,String sheetName,int row,int cell) throws EncryptedDocumentException,IOException   {
		String data="";
    FileInputStream file = new FileInputStream(filepath);

         Workbook workbook=   WorkbookFactory.create(file);
		 Sheet sheet= workbook.getSheet("Sheet2");
		 Row rowData=sheet.getRow(row);
		 Cell cellData= rowData.getCell(cell);
    
    
    try {
        data=cellData.getStringCellValue();	
    	
     }
    catch(IllegalStateException e) {
    	double value =cellData.getNumericCellValue();
    	String result = Double.toString(value);
    	data=result;
    	
    }
    catch(NullPointerException s)
    {
    	System.out.println("Feild is Empty");
    	
    }
  
    System.out.println(data);
    workbook.close();
    return data;
	}

public static void captureScreenShot(String TestID) throws IOException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	TakesScreenshot ts = (TakesScreenshot)driver;
	File src= ts.getScreenshotAs(OutputType.FILE);
	SimpleDateFormat formatee=new SimpleDateFormat("dd-MM-yyyy    HH mm ss");
	Date date= new Date();
	File dest= new File ("C:\\Users\\DELL\\Pictures\\Screenshots" +TestID+" " +formatee.format(date)+ "jpeg");
	FileHandler.copy(src, dest);

}

public static void main(String[] args) throws EncryptedDocumentException, IOException  {
	getDataromExcelSheet("src\\test\\resources\\DataResources\\Book1.xlsx", "Sheet2", 1,  0);
	getDataromExcelSheet("src\\test\\resources\\DataResources\\Book1.xlsx", "Sheet2",1,  1);
}
}