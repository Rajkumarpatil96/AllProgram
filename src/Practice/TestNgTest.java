package Practice;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import PracticePOM.KitePinpage;
import PracticeUtility.ExcelReaddata;

public class TestNgTest {
	WebDriver driver;
	loginpagePom login;
	KitePinpage pin;
	homepagePoM home;
	ExcelReaddata ex=new ExcelReaddata();
  @Parameters("Browsername")
  @BeforeClass
  public void lounchBrowser(String Browsername) 
  { 
	  Reporter.log("lounching the browser...",true);
	  if(Browsername.equals("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
	   driver=new ChromeDriver();
	  }
	  else if(Browsername.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		   driver=new FirefoxDriver();
	  }
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  driver.manage().window().maximize();
	  login=new loginpagePom(driver);
	  pin=new KitePinpage(driver);
	  home=new homepagePoM(driver);
	  
  }
  @BeforeMethod
  public void LoginKite() throws EncryptedDocumentException, IOException
  {   String username = ex.readdata(0, 0);
  String password = ex.readdata(0, 1);
 String pin1 = ex.readdata(0, 2);
 Reporter.log("Entering userid and password",true);
	  login.EnterUserId(username);
	  login.EnterPassword(password);
	  login.ClicOnLoginButton();
	  Reporter.log("loging in..");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	  pin.Sendpin(pin1);
	  pin.clickOnContinueButton();
	  Reporter.log("Click on continue button",true);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
  }
  @Test
  public void ValidateUserId() throws EncryptedDocumentException, IOException
  {
	   String actualuserid = home.getUserid();
	   String expecteduserid = ex.readdata(0, 0);
	   Assert.assertEquals(actualuserid, expecteduserid,"Actualuserid and expected userid is not matching");
	   Reporter.log("validate userid successfully,Test case is pass",true);
  }
  @AfterMethod
  public void kitelogout()
  {
	  Reporter.log("logout successfully",true);
	  home.ClicOnlogoutButton();
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("closing the browser",true);
	  driver.close();
  }

  
}
