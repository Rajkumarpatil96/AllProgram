package WaitORsinchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		//implicitlyWait--> Dynamic wait--> applicable for whole webpage
		//1000ms-->10ms page is loaded--> 900ms --> will be released
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	driver.switchTo().frame("iframeResult");
	driver.findElement(By.xpath("//button[@type='button']")).click();
	}

}
