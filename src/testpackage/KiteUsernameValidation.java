package testpackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import KitePomPackage.KiteHomePage;
import KitePomPackage.KiteloginPage;
import KitePomPackage.KitepinPage;
import baseClasses.Base;
import utilityPackage.Utility;
@Listeners(listnerPackage.Listener.class)
public class KiteUsernameValidation extends Base{
	KiteloginPage login;
	KitepinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void Browserlaunch()
	{
		lounchBrowser();
		login=new KiteloginPage(driver);
		pin=new KitepinPage(driver);
		home=new KiteHomePage(driver);
		
	}
	@BeforeMethod
	public void loginkiteApp() throws EncryptedDocumentException, IOException
	
	{  
		login.enteruserid(Utility.readDataFromExcel(0, 0));
		login.enterpassword(Utility.readDataFromExcel(0, 1));
		login.ClockOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		pin.sendpin(Utility.readDataFromExcel(0, 2));
		pin.ClickonContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	}
  @Test
  public void Validateuserid() throws EncryptedDocumentException, IOException {
	  String Actualuserid = home.getuserid();
	  String expectedUserId = Utility.readDataFromExcel(0, 0);
	  
	  Assert.assertEquals(Actualuserid, expectedUserId,"Actual and expected userid not matching");
	  Utility.takeScreenshot(driver, 1);
	  Reporter.log("userid validate ,test case 1 pass",true);
  }
  @AfterMethod
  public void KiteApplogout()
  {
	 home.ClickOnLogOutButton(); 
	 Reporter.log("logging out ..",true);
  }
  @AfterClass
  public void closeBrowser()
  
  {
	  BrowserClose();
  }
	  
  
  
}
