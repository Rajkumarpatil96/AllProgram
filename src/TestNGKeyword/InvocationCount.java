package TestNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvocationCount {//invocation count means calling that perticular method by given invocation count
  @Test(invocationCount = 5)
  public void a() {
	  Reporter.log("Method A running", true);
  }
  @AfterMethod//@time a method is calling @time After method will be calling
  public void After()
  {
	  Reporter.log("After method is Running", true);
  }
}
