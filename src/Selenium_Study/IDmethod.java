package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		Thread.sleep(3000);
		//driver.findElement(null)
		//locator-->id
		driver.findElement(By.id("email")).sendKeys("1123rrew");
		Thread.sleep(4000);
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("raj@123");
		//locator--->name
		driver.findElement(By.name("pass")).sendKeys("hasgjgj");
		Thread.sleep(3000);
		//locator--->tagname
		driver.findElement(By.tagName("button")).click();
	}

}
