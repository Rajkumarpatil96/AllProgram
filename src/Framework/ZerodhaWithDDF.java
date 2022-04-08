package Framework;

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

public class ZerodhaWithDDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		FileInputStream Myfile=new FileInputStream("C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium\\Exceldata\\Zerodhadetail.xlsx");
		Sheet mySheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		String userId1 = mySheet.getRow(0).getCell(0).getStringCellValue();
		String password1 = mySheet.getRow(0).getCell(1).getStringCellValue();
		String pin1 = mySheet.getRow(0).getCell(2).getStringCellValue();
		//System.out.println(pin1);
		WebElement useridField = driver.findElement(By.id("userid"));
		WebElement passwordField = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		useridField.sendKeys(userId1);
		passwordField.sendKeys(password1);
		loginButton.click();
		Thread.sleep(1000);
		WebElement pinField = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		pinField.sendKeys(pin1);
		continueButton.click();
		Thread.sleep(1000);
		WebElement userId = driver.findElement(By.className("user-id"));
		String actualuserId = userId.getText();
		String expectedUserId=userId1;
		if(actualuserId.equals(expectedUserId))
		{
			System.out.println("Test case is matching ,test case is pass");
		}else {
			System.out.println("test case is not matching ,test case is fail");
		}
		userId.click();
		Thread.sleep(2000);
		WebElement logoutButton = driver.findElement(By.linkText("Logout"));
		Thread.sleep(500);
		logoutButton.click();
		
	}

}
