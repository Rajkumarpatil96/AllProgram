package TestNgAnnotationStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationStudy {
  @Test
  public void ValidateUserId() {
	  Reporter.log("Running Test", true);
  }
  @Test
  public void Sample() {
	  Reporter.log("Running Sample Test", true);
  }
  @BeforeMethod
  public void LoginTokite()
  {
	  Reporter.log("Login In", true);
  }
  @AfterMethod
  public void logOut()
  {
	  Reporter.log("Logging out....", true);
  }
  @BeforeClass
  public void lounchBrowser()
  {
	  Reporter.log("lounching the browser ",true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("Closing Browser", true);
  }
}
