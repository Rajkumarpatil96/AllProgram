package testpackage;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import KitePomPackage.KiteloginPage;
import baseClasses.Base;
import utilityPackage.Utility;

public class Alltest extends Base {
	KiteloginPage login;
  @BeforeClass
  public void Browserlaunch() {
	  lounchBrowser();
	  login=new KiteloginPage(driver);
  }
//  @BeforeMethod
//  public void login() throws EncryptedDocumentException, IOException
//  {
//	  login.enteruserid(Utility.readDataFromExcel(0, 0));
//	  login.ClockOnLoginButton();
  //}
  @Test(priority=2)
  public void validatuseriderrormsg() throws EncryptedDocumentException, IOException, InterruptedException
  {
	  driver.navigate().refresh();
	  login.enterpassword(Utility.readDataFromExcel(0, 1));
	  login.ClockOnLoginButton();
	  String Actualuseriderrormsg = login.getuseridErrorMessage();
	  String expectedErrormsg = Utility.readDataFromExcel(0, 4);
	  Assert.assertEquals(Actualuseriderrormsg, expectedErrormsg,"Actual and expected are not matching");
	  Reporter.log("validate successful,test case is pass",true);
	  Utility.takeScreenshot(driver, 3);
	  
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
  }
  @Test(priority=1)
  public void validpasserrormsg() throws EncryptedDocumentException, IOException, InterruptedException 
  {
	  login.enteruserid(Utility.readDataFromExcel(0, 0));
	  login.ClockOnLoginButton();
	  Thread.sleep(1000);
	  String Actualpasserrormsg = login.getuseridErrorMessage();
	  String expectedpasserrorrmsg = Utility.readDataFromExcel(0, 3);
	  Assert.assertEquals(Actualpasserrormsg, expectedpasserrorrmsg,"Actual and expected are not matching ");
	  Reporter.log("validpassword error msg test case is pass ",true);
	  Utility.takeScreenshot(driver, 4);
	  
	  
  }
  @Test()
  public void botherrormsg() throws EncryptedDocumentException, IOException
  {
	  login.ClockOnLoginButton();
	  String expectedusererrormsg = Utility.readDataFromExcel(0, 4);
	  String actualusererrormsg = login.getuseridErrorMessage();
	 
	 SoftAssert soft=new SoftAssert();
	 soft.assertEquals(actualusererrormsg, expectedusererrormsg,"actual and expected are not matching");
	 Reporter.log("test case is pass",true);
	 //Utility.takeScreenshot(driver, 5);
	 
	 String actualpasserrormsg = login.getpassErrorMessage();
	 	 String expectederrormsg = Utility.readDataFromExcel(0, 3);
	 soft.assertEquals(actualpasserrormsg, expectederrormsg,"actual and expected are not matching");
	  Reporter.log("validate test case ",true);
	  Utility.takeScreenshot(driver, 6);
	  soft.assertAll();
  }
  @AfterClass
  public void browserclose()
  {
	  BrowserClose();
  }
}
