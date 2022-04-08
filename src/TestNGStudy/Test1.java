package TestNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void method1() {
	  System.out.println(" These is method1 of TestNg test1 class ");
  }
  @ Test
  public void method2()
  {
	  System.out.println(" this is  method2 of testNg Test1class");
	  Reporter.log("This is method of Test Ng Test1 class method2");
	  //this reporter class is used for the log the message in emailable report
  }
  @Test
  public  void method3()
  {
	  System.out.println("this method3 of TestNg class of test1 class");
	  Reporter.log("this method 3 of TestNg class of test1 class", true);
  }
}
