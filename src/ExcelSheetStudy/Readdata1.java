package ExcelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Readdata1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile=new FileInputStream("C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium\\Exceldata\\Excel1.xlsx");
//		String data1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		System.out.println("String data of Excel sheet " +data1);
//		String data2 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
//		System.out.println(data2);
	 double data3 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
	System.out.println(data3);
	}

}
