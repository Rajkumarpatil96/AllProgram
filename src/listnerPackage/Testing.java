package listnerPackage;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(listnerPackage.Listener.class)
public class Testing  {
  @Test
  public void TC1() {
	  Reporter.log("Tc1 is running",true);
  }
  @Test
  public void TC2()
  {  Assert.fail();
	  Reporter.log("TC2 IS running",true);
  }
  @Test(dependsOnMethods= {"TC2"})
  public void TC3()
  {
	  Reporter.log("TC3 is running",true);
  }
  public void TC4()
  {
	  Reporter.log("Running test case TC4",true);
  }
}
