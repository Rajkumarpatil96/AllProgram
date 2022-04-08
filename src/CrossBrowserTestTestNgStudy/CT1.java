package CrossBrowserTestTestNgStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CT1 {
  @Parameters("browsername")
	@Test
  public void CrossBrowser(String browsername) {
	  WebDriver driver=null;
	  if(browsername.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();
	  }
	  else if(browsername.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		   driver=new FirefoxDriver();
	  }
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().window().maximize();
	  driver.close();
  }
}
