package ZerodhaWithPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTestClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("start-maximize");
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://kite.zerodha.com/");
		
		//driver.manage().window().maximize();
		Kiteloginpage login=new Kiteloginpage(driver);
		login.sendUserID();
		login.sendPassword();
		login.loginButton();
		Thread.sleep(1000);
		kitepinpage pin=new kitepinpage(driver);
		pin.sendpin();
		
		pin.clickOnContinuebutton();
		Thread.sleep(1000);
		Kitehomepage home=new Kitehomepage(driver);
		home.validateUserId();
		Thread.sleep(1000);
		home.ClickOnLogoutButton();
		
	}

}
