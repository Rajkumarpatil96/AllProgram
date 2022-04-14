package TestNGStudy;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import facebookPOM.FBHomePOM;
import facebookPOM.FBLoginPOM;

public class FBTestclass {
	FBLoginPOM login;
	FBHomePOM home;
	WebDriver driver;
	@BeforeClass
	public void Browserlounch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login=new FBLoginPOM(driver);
		home=new FBHomePOM(driver);
		
	}
	@BeforeClass
	public void loginFB() throws InterruptedException
	{
		login.Senduserid("9665657531");
		login.sendpassword("Patilraju15");
		login.ClickOnLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
  @Test
  public void Validateusername() 
  {
	  home.ClickDownButton();
	  String Actualusname = home.getusername();
	  String Expectedusname = "Rajkumar Patil";
	  Assert.assertEquals(Actualusname, Expectedusname,"Actual And Expected Username are not matching");
	  Reporter.log("validate Username success",true);
  }
  @AfterMethod
  public void FBlogout()
  {
	  home.ClickOnlogout();
  }
  
}
