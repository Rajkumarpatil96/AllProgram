package TestNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AllKeywordCombine {
  @Test(invocationCount = 2,priority = 1)
  public void Sample() {
	  Reporter.log("This is a sample method ", true);
	  }
  @Test(timeOut = 500,priority = 0)
  public void sample1() throws InterruptedException {
	  Thread.sleep(400);
	  Reporter.log("this is sample1 method", true);
  }
  @Test(priority = -1)
  public void sample2()
  {
	  Reporter.log("this is sample2 method", true);
  }
}
