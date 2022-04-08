package AssertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsStudy {
  @Test
  public void TC1() {
	  String a="Velocity";
	  String b="velocity";
	  Assert.assertEquals(b, a,"String is not Equal");//this message will show after the condition fail
  }
  @Test
  public void TC2()
  {
	  String b="Velocity";
	  Assert.assertNotNull(b,"String is null");
  }
}
