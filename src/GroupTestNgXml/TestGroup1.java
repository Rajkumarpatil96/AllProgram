package GroupTestNgXml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestGroup1 {
  @Test(groups = "regression")
  public void TC1() {
	  Reporter.log("Running tast case 1", true);
  }
  @Test(groups = {"sanity","regression"})
  public void TC2() {
	  Reporter.log("Running tast case 2", true);
  }
  @Test(groups = "sanity")
  public void TC3() {
	  Reporter.log("Running tast case 3", true);
  }
  @Test(groups = "regression")
  public void TC4() {
	  Reporter.log("Running tast case 4", true);
  }
}
