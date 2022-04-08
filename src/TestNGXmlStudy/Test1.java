package TestNGXmlStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void TC1() {
	  Reporter.log("Test case 1 is Running", true);
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
  @Test
  public void TC4()
  {
	  Reporter.log("Running test case 4", true);
  }
  
}
