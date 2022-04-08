package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
	WebDriver d=new ChromeDriver();
		d.get("https://vctcpune.com/");
		Thread.sleep(3000);
		d.navigate().to("https://vctcpune.com/selenium/practice.html");
		d.findElement(By.xpath("//input[@value='Radio1']")).click();
		
		
	}

}
