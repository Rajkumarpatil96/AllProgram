package PracticePOM;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import KiteAppusingPOMDDF.kitehomepage;
import PracticeUtility.ExcelReaddata;
import net.bytebuddy.utility.RandomString;

public class KiteTestClass  {
	

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		
		KiteLoginpage login=new KiteLoginpage(driver);
		ExcelReaddata ex = new ExcelReaddata();
		 String usernamedata = ex.readdata(0, 0);
		login.Senduserid(usernamedata);
		login.Sendpassword("Velocity@123");
		login.ClickOnLoginButton();
		Thread.sleep(1000);
		
		KitePinpage piin=new KitePinpage(driver);
		piin.Sendpin("866918");
		piin.clickOnContinueButton();
		Thread.sleep(2000);
		
		KitehomePage home=new KitehomePage(driver);
		home.validateUserId();
		home.clickOnlogoutButton();
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String name=RandomString.make(2);
		String path = System.getProperty("user.dir")+"\\screenshots\\raj"+name+".png";
		File destination= new File(path);
		FileHandler.copy(source, destination);
		
		
		
	}

}
