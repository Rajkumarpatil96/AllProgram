package AssertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertFalseStudy {
  @Test
  public void f() {
	  boolean result =false;
	  Assert.assertFalse(result, "String is true");
  }
}
