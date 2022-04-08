package baseClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;

import utilityPackage.utilityusingproprtyfile;

public class BaseusingPropertyfile {
	protected WebDriver driver;
	//@Parameters()
	
	public void launchBroser(String browsername) throws IOException
	{
		if(browsername.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		 ChromeOptions opt=new ChromeOptions();
		 opt.addArguments("--disable-notification");
		driver=new ChromeDriver(opt);
		}
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get(utilityusingproprtyfile.getdatafrompropertyfile("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();
		Reporter.log("Browser launch Successful ",true);
		
	}
	public void CloseBrowser()
	{
		driver.close();
		Reporter.log("Browser close",true);
	}

}
