package TestNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethodStudy {
 
	@Test(dependsOnMethods = {"C"})//method A is depend upoun the method C when Method C excute After
                                //method A is Excute 
  public void A() {
	  Reporter.log("Method A is Running", true);
  }
  @Test
  public void B() {
	  Reporter.log("Method B is Running", true);
  }
  @Test
  public void C() {
	  Reporter.log("Method C is Running", true);
  }
}
