package TestNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Allkeyword {
  @Test(invocationCount = 2,dependsOnMethods = {"TC3"})
  public void TC1() {
	  Reporter.log("TC1 is Running", true);
  }
  @Test(enabled = true)
  public void TC2() {
	  Reporter.log("TC2 is Running", true);
  }
  @Test(timeOut = 200)
  public void TC3() throws InterruptedException {
	  //Thread.sleep(250);
	  Reporter.log("TC3 is Running", true);
  }
  @Test(priority = -1)
  public void TC4() {
	  Reporter.log("TC4 is Running", true);
  }
}
