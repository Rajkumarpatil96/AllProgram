package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(200);
		WebElement showtextbox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		
		boolean result = showtextbox.isDisplayed();
		System.out.println("displayed textbox " +result);
	     WebElement hidetextbox = driver.findElement(By.xpath("//input[@value='Hide']"));
	     hidetextbox.click();
	     boolean result1 = hidetextbox.isDisplayed();
	     System.out.println("hide result is " +result1);
	     
		
		
	}

}
