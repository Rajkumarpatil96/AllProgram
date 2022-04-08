package Mock26;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robotclass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		Actions act=new Actions(driver);
		act.contextClick().perform();
		Thread.sleep(500);
		Robot rb=new Robot();
		
		rb.keyPress(KeyEvent.VK_PAGE_UP);
		rb.keyPress(KeyEvent.VK_PAGE_UP);
		//rb.keyPress(KeyEvent.VK_DOWN);
//		rb.keyPress(KeyEvent.VK_DOWN);
//		rb.keyPress(KeyEvent.VK_DOWN);
//		rb.keyPress(KeyEvent.VK_DOWN);
//		rb.keyPress(KeyEvent.VK_DOWN);
//		rb.keyPress(KeyEvent.VK_DOWN);
//		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_ENTER);
	}

}
