package KitePOMTESTNG;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PracticeUtility.ExcelReaddata;

public class KiteTestUsingTestNG {
	WebDriver driver;
	 ExcelReaddata ex=new ExcelReaddata();
	 Kiteloginpage login;
	 KitePinPage pin;
	 KiteHomePage home;
  @BeforeClass
  public void BrowserLounch() throws EncryptedDocumentException, IOException {
	  Reporter.log("Lounching Browser....",true);
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	   Reporter.log("lounching browser Successfully",true);
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  driver.manage().window().maximize();
	 login=new Kiteloginpage(driver);
	 pin=new KitePinPage(driver);
	 home=new KiteHomePage(driver);
	 
	  
  }
  @BeforeMethod
  public void LoginToKiteApp() throws EncryptedDocumentException, IOException
  {		 String EXuserid = ex.readdata(0, 0);
  			String Expassword = ex.readdata(0, 1);
  			String EXpin = ex.readdata(0, 2);
	  //Kiteloginpage login=new Kiteloginpage(driver);
  		Reporter.log("Entering userid And password",true);
	  login.enterUserID(EXuserid);
	  login.enterPassword(Expassword);
	  login.clickOnLoginButton();
	  Reporter.log("login succses",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  Reporter.log("Entering pin",true);
	  pin.enterPin(EXpin);
	  pin.clickonContinuebutton();
	 
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  
  }
  @Test
  public void validateUserId() throws EncryptedDocumentException, IOException
  {
	  String ExpectedUserId = ex.readdata(0, 0);
	  String actualuserid = home.getactualUserid();
	  Assert.assertEquals(actualuserid, ExpectedUserId,"Actual and Expected userid not matching ");
	  Reporter.log("Validating userId successfully,Test case is pass",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
  }
  @AfterMethod
  public void logOutKiteApp()
  {	Reporter.log("logging out...",true);
	  home.clickOnLogOutButton();
  }
  @AfterClass
  public void closeBrowser()
  {Reporter.log("driver close",true);
	  driver.close();
  }
  
}
