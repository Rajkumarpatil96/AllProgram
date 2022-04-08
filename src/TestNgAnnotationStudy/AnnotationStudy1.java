package TestNgAnnotationStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationStudy1 {//At the Excution time Excute the method by Albhabetical Order By Default
  @Test(groups = "regression")
  public void a() {
	  Reporter.log("Running method a", true);
  }
  @Test
  public void c() {
	  Reporter.log("Running method c", true);
  }
  @Test
  public void b() {
	  Reporter.log("Running method b", true);
  }
  
}
