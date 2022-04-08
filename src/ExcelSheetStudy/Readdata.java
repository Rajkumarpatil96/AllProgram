package ExcelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.exec.InputStreamPumper;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile=new FileInputStream("C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium\\Exceldata\\Book1.xlsx");
//		String Stringdata = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//	System.out.println("String data present in excel sheet is "+ Stringdata);
//	
	double Value = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
	System.out.println("integer data fetch from the Excelsheet "+Value);
	}

}
