package Selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quitmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://youtube.com/");
		Driver.get("http://gmail.com");
		Thread.sleep(3000);
		Driver.manage().window().maximize();
		Thread.sleep(3000);
		//Driver.manage().window().minimize();
		//Thread.sleep(3000);
		Driver.get("http://facebook.com");
		Driver.quit();
	}

}
