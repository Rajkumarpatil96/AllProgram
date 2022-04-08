package Selenium_Study;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setsize {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		Thread.sleep(3000);
		System.out.println(driver.manage().window().getSize());
		Dimension D=new Dimension(1500,2000);
		driver.manage().window().setSize(D);
		System.out.println(driver.manage().window().getSize());
	}

}
