package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isenable1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(15000);
		WebElement signinbutton = driver.findElement(By.xpath("(//h6[text()='Sign In'])[1]"));
		signinbutton.click();
		Thread.sleep(2000);
		WebElement Getotpbutton = driver.findElement(By.xpath("(//button[text()='Get OTP'])[1]"));
		boolean result = Getotpbutton.isEnabled();
	}

}
