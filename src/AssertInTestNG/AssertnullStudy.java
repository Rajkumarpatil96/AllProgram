package AssertInTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertnullStudy {
  @Test
  public void Tc1() {
	  String[]name=new String[3];
	  name[0]=null;
	  name[1]="katraj";
	  name[2]="velocity";
	 
	  Assert.assertNull(name[1], "String Array not null");
	  
  }
}
