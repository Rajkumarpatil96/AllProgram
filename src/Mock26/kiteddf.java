package Mock26;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class kiteddf {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream Myfile=new FileInputStream("C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium\\Exceldata\\Multidata.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		int totalrowscount = Mysheet.getLastRowNum();
		
		int totalcolumncount = Mysheet.getRow(0).getLastCellNum()-1;
		String data1 = Mysheet.getRow(3).getCell(0).getStringCellValue();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		for(int i=0;i<=totalrowscount;i++)
		{
			for(int j=0;j<=totalcolumncount;j++)
			{
				Cell data = Mysheet.getRow(i).getCell(j);
				CellType type = data.getCellType();
				 String expecteddata = data1;
					WebElement useid = driver.findElement(By.id("userid"));
				if(data.equals(expecteddata)) {
				if(type==CellType.STRING)
				{
					String value = data.getStringCellValue();
					//WebElement useid = driver.findElement(By.id("userid"));
					useid.sendKeys(value);
					//System.out.print(value+" ");
				}else if(type==CellType.BOOLEAN)
				{
					boolean value = data.getBooleanCellValue();
					//System.out.print(value+" ");
					
				}else if(type==CellType.NUMERIC)
				{
					double value = data.getNumericCellValue();
				
					
				}else if(type==CellType.BLANK)
				{
					System.out.print("    ");
				}
				else {
					System.out.println(" not matching data");
				}
				
			}
			
		}
	}

	}
}




