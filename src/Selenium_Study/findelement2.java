package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement2 {

	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h1[contains(@class,' header1 font-weight-bold text-white text-center')]"));//xpath by contains with attributes
		driver.findElement(By.xpath(" //h1[contains(text(),'Welcome To ')]"));//xpath by contains with text();

	}

}
