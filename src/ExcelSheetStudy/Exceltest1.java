package ExcelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exceltest1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile=new FileInputStream("C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium\\Exceldata\\Excel2.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		//method  getting the row from the Excel sheet
		int lastrow = Mysheet.getLastRowNum();
		System.out.println("last row of the Excel is "+lastrow);//to find the last row number of sheet
		int totalcount = lastrow;
		//method for the getting the last column from the Excel Sheet
		short lastcolumn = Mysheet.getRow(0).getLastCellNum();
		System.out.println("last column of the Excel sheet "+lastcolumn);
		int totalcolumn = lastcolumn-1;
		for(int i=0;i<=totalcount;i++)
		{
			for(int j=0;j<=totalcolumn;j++)
			{
				String data = Mysheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(data+" ||");
			}
			System.out.println();
		}
	}

}
