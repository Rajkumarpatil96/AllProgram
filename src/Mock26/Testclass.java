package Mock26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testclass {
	Pomloginpage login;
  @BeforeClass
  public void lounchBrowser() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		login=new Pomloginpage(driver);
  }
  @Test(enabled=false)
  public void ValidateUseridErrormessage() throws InterruptedException
  {
	  login.ClickOnloginButton();
	  Thread.sleep(200);
	  String Actualtext = login.getErrorText();
	  String expectedError = "User ID should be minimum 6 characters.";
	  Assert.assertEquals(Actualtext, expectedError,"text not matching");
	  
  }
  @Test(enabled=false)
  public void validatepassworderror()
  {
	  login.ClickOnloginButton();
	  String ActualpassError = login.getErrorpasstext();
	  String expectedpasserror = "Password should be minimum 6 characters.";
	  Assert.assertEquals(ActualpassError, expectedpasserror,"Actual and expected error not maching");
  }
  @Test
  public void validateloginErrorMessage() throws InterruptedException
  {
	  login.enterUserid();
	  login.ClickOnloginButton();
	  Thread.sleep(500);
	  String Actualinvaliderror = login.geterrorinvalidPWD();
	  System.out.println(Actualinvaliderror);
	  String expectedinvalidError = "Invalid CAPTCHA values.";
	  		
	  	
	  
	  Assert.assertEquals(Actualinvaliderror, expectedinvalidError,"Actual and expected error message not matching");
	 

	  		
  }
  
}
