package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scollintoview1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		driver.manage().window().maximize();
		WebElement Button3 = driver.findElement(By.xpath("(//input[@name='radio'])[3]"));
		JavascriptExecutor Scroll = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		Scroll.executeScript("arguments[0].scrollIntoView();",Button3);
		Button3.click();
	}

}
