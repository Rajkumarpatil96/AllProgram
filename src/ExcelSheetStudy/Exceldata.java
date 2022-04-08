package ExcelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceldata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile=new FileInputStream("C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium\\Exceldata\\Excel2.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		String value1 = Mysheet.getRow(0).getCell(0).getStringCellValue();
		String value2 = Mysheet.getRow(0).getCell(1).getStringCellValue();
		String value3 = Mysheet.getRow(0).getCell(2).getStringCellValue();
		CellType type = Mysheet.getRow(0).getCell(0).getCellType();
		//System.out.println(type);
		String value4 = Mysheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}

}
