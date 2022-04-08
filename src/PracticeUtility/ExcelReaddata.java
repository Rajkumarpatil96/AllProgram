package PracticeUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReaddata {

	
	
	public    String  readdata(int row,int column) throws EncryptedDocumentException, IOException
	{
		FileInputStream myfile=new FileInputStream("C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium\\Exceldata\\Zerodhadetail.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		
		String data = mysheet.getRow(row).getCell(column).getStringCellValue();
		return data;
		
	}

}
