package TestNgAnnotationStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationStudy2 {
  @Test
  public void validatepin() {
	  Reporter.log("Pin validation done--->@Test used", true);
  }
  @Test
  public void validateUserId() {
	  Reporter.log("userid validation done-->@Test used", true);
  }
  @BeforeMethod
  public void loginToKite() {
	  Reporter.log("Enterred userid password done---> @Beforemethod used", true);
  }
  @AfterMethod
  public void logout()
  {
	  Reporter.log("logout successful -->@Aftermethod Used", true);
  }
  @BeforeClass
  public void LounchingBrowser() {
	  Reporter.log("Lounching Browser---> @Beforeclass used", true);
  }
  @AfterClass
  public void closeBrowser()
  {
	  Reporter.log("close the Browser --->@Afterclass used", true);
  }
}
