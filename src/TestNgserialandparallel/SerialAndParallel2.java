package TestNgserialandparallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SerialAndParallel2 {
	 @Test
	  public void Method() throws InterruptedException 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://vctcpune.com/selenium/practice.html");
		  driver.manage().window().maximize();
		  
		  driver.close();
	  }
	 @Test
	 public void TC1()
	 {
		 Reporter.log("This is a test case 1",true);
	 }
	 @Test
	 public void TC2()
	 {
		 Reporter.log("This is a test case 2",true);
	 }
	 @Test
	 public void TC3()
	 {
		 Reporter.log("This is a test case 3",true);
	 }
	 @Test
	 public void TC4()
	 {
		 Reporter.log("This is a test case 4",true);
	 } @Test
	 public void TC5()
	 {
		 Reporter.log("This is a test case 5",true);
	 }
	 @Test
	 public void TC6()
	 {
		 Reporter.log("This is a test case 6",true);
	 } 
	 
}
