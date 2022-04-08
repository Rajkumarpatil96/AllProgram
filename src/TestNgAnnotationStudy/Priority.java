package TestNgAnnotationStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {//      -4  -3 -2 -1 0    1  2  3  4    ==>in that highest priority decide 
  @Test(priority = 1)//<-|---|--|--|--|--|--|---|--|--|--|->   on  the number line first number will
  public void a() {                            //               negative number i.e -4 is high priority
	  Reporter.log("Running a method", true);  //    By default priority is 0
  }                                             //when duplicate numbers of priority is there at the 
  @Test                                          //priority decide on Alphabetical order
  public void b() {
	  Reporter.log("Running b method", true);
  }
  @Test
  public void c() {
	  Reporter.log("Running c method", true);
  }
  
}
