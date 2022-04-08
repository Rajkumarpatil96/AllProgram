package testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KitePomPackage.KiteloginPage;
import baseClasses.Base;
import utilityPackage.Utility;

public class validatepasswordErrormessage extends Base {
	KiteloginPage login;
	@BeforeClass
	public void lounchingbrowser() 
	{
		lounchBrowser();
		login=new KiteloginPage(driver);
	}
	@BeforeMethod
	public void kiteApplogin() throws EncryptedDocumentException, IOException
	{
		login.enteruserid(Utility.readDataFromExcel(0, 0));
		login.ClockOnLoginButton();
	}
	@Test
	public void validatepassErrorMessage() throws EncryptedDocumentException, IOException
	{
	String Actualpasserrormsg = login.getpassErrorMessage();
	String expectederrormsg = Utility.readDataFromExcel(0, 3);
	Assert.assertEquals(Actualpasserrormsg, expectederrormsg,"Error msg not matching");
	Utility.takeScreenshot(driver, 2);
	Reporter.log("validation of error msg success,test case is pass",true);
	}
//	@Test
//	public void validateuseridErrormessage() throws EncryptedDocumentException, IOException
//	{String expectedErrorMsg = Utility.readDataFromExcel(0, 4);
//		String ActualErrorMessage = login.getuseridErrorMessage();
//		Assert.assertEquals(ActualErrorMessage, expectedErrorMsg,"Actual and expected msg not matching");
//	}
	@AfterClass
	public void closeBrowser()
	{
		BrowserClose();
	}
  
}
