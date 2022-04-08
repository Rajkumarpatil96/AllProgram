package TestNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnableStudy {
  @Test
  public void A() {
	  Reporter.log("Method A is running", true);
  }
  @Test(enabled = false)//methods are by default enable
  public void B() {
	  Reporter.log("Method B is running", true);
  }
  @Test
  public void C() {
	  Reporter.log("Method C is running", true);
  }
}
