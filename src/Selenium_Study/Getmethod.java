package Selenium_Study;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://youtube.com");
		
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.navigate().to("http://instagram.com");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.manage().window().getSize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
