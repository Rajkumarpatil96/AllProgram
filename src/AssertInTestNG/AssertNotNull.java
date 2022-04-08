package AssertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotNull {
  @Test
  public void f() {
	  String a="Velocity";
	  Assert.assertNotNull(a, "String is null");
  }
}
