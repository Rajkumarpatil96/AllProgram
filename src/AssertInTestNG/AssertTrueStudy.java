package AssertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueStudy {
  @Test
  public void f() {
	  boolean result=false;
	  Assert.assertTrue(result, "String is false");
  }
}
