package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//legend[text()='Dropdown Example']")).click();
		

	}

}
