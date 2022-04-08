package testpackage;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import KitePomPackage.KiteloginPage;
import baseClasses.Base;
import utilityPackage.Utility;

public class CombineAll extends Base {
	KiteloginPage login;
  @BeforeClass
  public void Browserlounch() {
	  lounchBrowser();
	  login=new KiteloginPage(driver);
  }
  
  @Test
  public void validateuseriderrormsg() throws EncryptedDocumentException, IOException
  {
	  login.enterpassword(Utility.readDataFromExcel(0, 1));
	  login.ClockOnLoginButton();
	  String actualerror = login.getuseridErrorMessage();
	  
	  String expectederrormsg = Utility.readDataFromExcel(0, 4);
	  Assert.assertEquals(actualerror, expectederrormsg,"Actual and expected userid error msg not matching");
	  Reporter.log("validate userid error msg succecssful,test case is pass",true);
  }
  @AfterClass
  public void browserclose()
  {
	  BrowserClose();
  }
}
