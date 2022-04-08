package AssertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFailStudy {
  @Test
  public void f() {
	   String a="Velocity";
	   String b=null;
	   Assert.assertNotNull(a, "String is null");
	   Assert.assertNull(b, "String is not null");
	   Assert.fail();
  }
}
