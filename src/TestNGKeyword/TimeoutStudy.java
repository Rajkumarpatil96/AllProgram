package TestNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeoutStudy {
  @Test
  public void A() {
	  Reporter.log("Method A is Running", true);
  }
  @Test(timeOut = 1000)//check method is excute in 1000 ms if there is not excute then method is false
  public void B() throws InterruptedException {
	  Thread.sleep(1100);
	  Reporter.log("Method B is Running", true);
  }
  @Test
  public void C() {
	  Reporter.log("Method C is Running", true);
  }
}
