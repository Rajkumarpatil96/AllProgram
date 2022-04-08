package testpackage;

import java.io.IOException;
import java.time.Duration;

import org.testng.Assert;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import KitePomPackage.KiteHomePage;
import KitePomPackage.KiteloginPage;
import KitePomPackage.KitepinPage;
import baseClasses.BaseusingPropertyfile;
import utilityPackage.utilityusingproprtyfile;
//@Listeners(listnerPackage.Listener.class)
public class KiteAppUserNameValidationUsingPropertyFile extends BaseusingPropertyfile{
	KiteloginPage login;
	KitepinPage pin;
	KiteHomePage home;
	@Parameters("browsername")
	@BeforeClass
	public void Browerlaunch(String browsername) throws IOException
	{
		launchBroser(browsername);
		login=new KiteloginPage(driver);
		pin=new KitepinPage(driver);
		home=new KiteHomePage(driver);
	}
	@BeforeMethod
	public void loginkiteApp() throws IOException
	{
		login.enteruserid(utilityusingproprtyfile.getdatafrompropertyfile("UN"));
		login.enterpassword(utilityusingproprtyfile.getdatafrompropertyfile("PWD"));
		login.ClockOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		pin.sendpin(utilityusingproprtyfile.getdatafrompropertyfile("PIN"));
		pin.ClickonContinueButton();
		Reporter.log("login success",true);
	}
  @Test
  public void ValidateUsername() throws IOException 
  {
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	 //Assert.fail();
	  String ActualuserID = home.getuserid();
	 
	 String expectecteduserid = utilityusingproprtyfile.getdatafrompropertyfile("UN");
	 Assert.assertEquals(ActualuserID, expectecteduserid,"Actual And expected Userid Are not matching");
	 utilityusingproprtyfile.getScreenshot(driver, 10);
	 Reporter.log("validation successful,test case pass",true);
  }
  @AfterMethod
  public void kiteApplogout(ITestResult result) throws IOException
  
  {
	  if(result.getStatus()==result.FAILURE)
	  {
		  utilityusingproprtyfile.getScreenshot(driver, 11);
	  
	  
	  //home.ClickOnLogOutButton();
	  }else
	  {
		  Reporter.log("Test case is pass",true);
	  }
  }
  @AfterClass
  public void browserclose()
  {
	  CloseBrowser();
  }
}
