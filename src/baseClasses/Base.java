package baseClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base {
	protected WebDriver driver;
public void lounchBrowser()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notification");
	 driver=new ChromeDriver(opt);
	 driver.get("https://kite.zerodha.com/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	 driver.manage().window().maximize();
	 Reporter.log("Lounching browser succeseful",true);
	
}
public void BrowserClose()
{Reporter.log("Closing the browser",true);
	driver.close();
}
}
