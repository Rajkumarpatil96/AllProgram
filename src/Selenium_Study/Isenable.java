package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isenable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(5000);
		WebElement signin = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		signin.click();
		Thread.sleep(3000);
		WebElement getotpbutten = driver.findElement(By.tagName("button"));
		getotpbutten.isEnabled();
		boolean result = getotpbutten.isEnabled();
		if(result)
		{
			System.out.println("get otp button is enable"+result);
		}
		else {
			
			driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9546221110");
			Thread.sleep(3000);
			getotpbutten.click();
			
		}
	}

}
