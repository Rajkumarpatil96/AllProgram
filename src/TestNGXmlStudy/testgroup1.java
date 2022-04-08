package TestNGXmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testgroup1 {
  @Test
  public void TC1() {
	  Reporter.log("Running tast case 1", true);
  }
  @Test
  public void TC2()
  {
	  Reporter.log("Running test case 2", true);
  }
  @Test
  public void TC3()
  {
	  Reporter.log("Running test case 3", true);
  }
}
