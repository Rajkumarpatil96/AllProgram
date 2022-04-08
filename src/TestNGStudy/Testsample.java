package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testsample {
  @Test
  public void Usernamr() {
	  System.out.println(" Username of Test sample class");
  }
  @Test
  public void passWord() {
	  System.out.println("password of testSAMPLE class");
	  Reporter.log("Enter the valid password", true);
  }
}
