package GroupTestNgXml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestGroup2 {
  @Test(groups = "regression")
  public void TC11() {
	  Reporter.log("Test case 11 is running", true);
  }
  @Test(groups = "sanity")
  public void TC12() {
	  Reporter.log("Test case 12 is running", true);
  }
  @Test(groups = "sanity")
  public void TC13() {
	  Reporter.log("Test case 13 is running", true);
  }
  @Test(groups = "regression")
  public void TC14() {
	  Reporter.log("Test case 14 is running", true);
  }
}
