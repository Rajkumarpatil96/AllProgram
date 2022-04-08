package TestNgAnnotationStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation3 {
  @Test(groups = "regression")
  public void validateUserid() {
	  Reporter.log("Validate userid -->@Test method used", true);
  }
  @Test(groups = "sanity")
  public void validatepin() {
	  Reporter.log("Validate pin -->@Test method used", true);
  }
  @BeforeMethod
  public void login()
  {
	  Reporter.log("login successful--->@Before method used", true);
  }
  @BeforeClass
  public void lounchBrowser()
  {
	  Reporter.log("lounching Browser-->@Beforeclass method used", true);
  }
  @AfterMethod
  public void logout()
  
  {
	  Reporter.log("log out successful--->@Beforemethod used", true);
  }
  @AfterClass
  public void browserclose()
  {
	  Reporter.log("Close the Browser--->@After class method is used", true);
  }
}
