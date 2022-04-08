package listnerPackage;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testing1 {
  @Test
  public void p() {
	  Reporter.log("Running test case p",true);
  }
  @Test
  public void q() {
	  Assert.fail();
	  Reporter.log("Running test case q",true);
  }
  @Test
  public void R() {
	  Reporter.log("Running test case r",true);
  }
  @Test(dependsOnMethods= {"q"})
  public void S() {
	  Reporter.log("Running test case s",true);
  }
}
