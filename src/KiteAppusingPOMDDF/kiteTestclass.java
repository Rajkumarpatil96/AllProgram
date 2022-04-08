package KiteAppusingPOMDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ZerodhaWithPOM.kitepinpage;

public class kiteTestclass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		FileInputStream Myfile=new FileInputStream("C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium\\Exceldata\\Userdata.xlsx");
		Sheet mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		//String pinUser = mysheet.getRow(0).getCell(2).getStringCellValue();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		Kiteloginpage login =new Kiteloginpage(driver);
		login.sendUserId(mysheet.getRow(0).getCell(0).getStringCellValue());
		login.sendpassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		login.ClickOnloginButton();
		Thread.sleep(500);
		Kitepinpage kpin= new Kitepinpage(driver);
		kpin.Sendpin1(mysheet.getRow(0).getCell(2).getStringCellValue());
		kpin.ClickonButton();
		Thread.sleep(1000);
		kitehomepage home=new kitehomepage(driver);
		home.validatetext(mysheet.getRow(0).getCell(0).getStringCellValue());
			home.clickonuserid();
			
		
	}

}
