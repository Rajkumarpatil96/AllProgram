package TestNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOnMethod {
  @Test(timeOut = 200)
  public void A() throws InterruptedException {
	  Thread.sleep(500);
	  Reporter.log("Running A method is Running", true);
  }
  @Test
  public void B() {
	  Reporter.log("Running B method is Running", true);
  }
  @Test(dependsOnMethods = {"A"})//c method is depend on the method A method is fail hence method 
  public void C() {//               C is Skipped this method canot Excute because depend on the A method
	  Reporter.log("Running C method is Running", true);
  }
}
