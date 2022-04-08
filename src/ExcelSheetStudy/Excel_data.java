package ExcelSheetStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile=new FileInputStream("C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium\\Exceldata\\data2.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		int totalrowscount = Mysheet.getLastRowNum();
		
		int totalcolumncount = Mysheet.getRow(0).getLastCellNum()-1;
		for(int i=0;i<=totalrowscount;i++)
		{
			for(int j=0;j<=totalcolumncount;j++)
			{
				Cell data = Mysheet.getRow(i).getCell(j);
				CellType type = data.getCellType();
				if(type==CellType.STRING)
				{
					String value1 = data.getStringCellValue();
					System.out.print(value1+" ");
				}else if(type==CellType.BOOLEAN)
				{
					boolean value2 = data.getBooleanCellValue();
					System.out.print(value2+" ");
					
				}else if(type==CellType.NUMERIC)
				{
					double value3 = data.getNumericCellValue();
					System.out.print(value3+" ");
				}else if(type==CellType.BLANK)
				{
					System.out.print("    ");
				}
			}
			System.out.println();
		}
	}

}
