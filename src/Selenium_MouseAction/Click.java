package Selenium_MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebElement elementButton = driver.findElement(By.xpath("//div[@class='header-wrapper'][1]"));
		//we can perform only mouse action by using Actions class
		Actions act=new Actions(driver);
		act.click(elementButton).perform();
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("(//li[@id='item-4'])[4]"));
		JavascriptExecutor Scroll = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		Scroll.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		act.click().perform();
		Thread.sleep(2000);
		WebElement clickButton = driver.findElement(By.xpath("(//button[@type='button'])[4]"));
		act.click(clickButton).perform();
		Thread.sleep(2000);
		driver.close();
	}

}
