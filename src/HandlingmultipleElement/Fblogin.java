package HandlingmultipleElement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fblogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		FileInputStream Myfile=new FileInputStream("C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium\\Exceldata\\usernamepass.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		String emailid = Mysheet.getRow(0).getCell(0).getStringCellValue();
		String password = Mysheet.getRow(0).getCell(1).getStringCellValue();
		int totalrowcount = Mysheet.getLastRowNum();
		int totalcolumncount = Mysheet.getRow(0).getLastCellNum();
		int countcolumn = totalcolumncount-1;
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/");
		String expectedresult = "raj@123gmail.com";
		String expectedresult1 = "pass@123456";
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));

		WebElement password1 = driver.findElement(By.xpath("//input[@id='pass']"));
		for(int i=0;i<=totalrowcount;i++)
		{
			
		
			for(int j=0;j<=countcolumn;j++)
			{
				//String data = Mysheet.getRow(i).getCell(j).getStringCellValue();
				if(j==0)
				{
					String data = Mysheet.getRow(i).getCell(0).getStringCellValue();
				//WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
				username.sendKeys(data);
				Thread.sleep(200);
				}else
				{
					password=Mysheet.getRow(i).getCell(1).getStringCellValue();
					password1.sendKeys(password);
					Thread.sleep(1000);
					driver.findElement(By.xpath("//button[@name='login']")).click();
				
				}
				
				
			}
			
		
		
		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(emailid);
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		
	}
		//driver.findElement(By.xpath("//button[@name='login']")).click();

}
	}


		
	
