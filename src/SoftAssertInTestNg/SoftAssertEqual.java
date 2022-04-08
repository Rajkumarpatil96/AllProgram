package SoftAssertInTestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertEqual {
	SoftAssert soft=new SoftAssert();
  @Test
  public void f() {
	  String a="pune";//in soft assert overcome the drawback of hard assert 
	  String b="pune";//in soft assert Verification failed then next verification can be done 
	  soft.assertEquals(a, b," String is not Equal");//it can not stop if any verification fail
	  soft.assertNotNull(b,"String is not null");
	  soft.assertAll();
  }
  @Test
  public void f1()
  {
	  String a="satara";
	  String b="kolhapur";
	  soft.assertNotEquals(a, b,"String is equal");
	  soft.assertNull(b,"String is not null");
	  soft.assertAll();
  }
  @Test
  public void f2()
  {
	  String a="pune";
	  String b="pune";
	  Assert.assertEquals(a, b,"String is not equal");
	  
  }
}
