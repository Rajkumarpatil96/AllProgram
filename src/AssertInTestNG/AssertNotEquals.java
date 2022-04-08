package AssertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNotEquals {
  @Test
  public void TC1() {
	  String a="abcd";
	  String b="abcd";
	  Assert.assertNotEquals(a, b,"Strings are equals");
  }
}
