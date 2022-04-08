package ExcelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelmultidatafetch {

	private static final String String = null;

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile=new FileInputStream("C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium\\Exceldata\\data1.xlsx");
		Sheet mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		int totalrowscount = mysheet.getLastRowNum();
		int totalcolumncount = mysheet.getRow(0).getLastCellNum()-1;
		System.out.println(totalcolumncount);
		//Outer for loop always for rows
		for(int i=0;i<=totalrowscount;i++)
		{
			for(int j=0;j<=totalcolumncount;j++)
			{
				Cell data = mysheet.getRow(i).getCell(j);
				CellType type = data.getCellType();
				
				if(type==CellType.STRING)
					
				{     String value = data.getStringCellValue();
					System.out.print(value+" ||");
				}
				else if(type==CellType.NUMERIC)
				{     double value1 = data.getNumericCellValue();
					System.out.print(value1+" ||");
				}else if(type==CellType.BOOLEAN)
				{     boolean value2 = data.getBooleanCellValue();
					System.out.print(data+" ||");
				}
				else if(type==CellType.BLANK)
				{      
					System.out.print("       ||");
				}
				
			}
			System.out.println();
		}
	}

}
