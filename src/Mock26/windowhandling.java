package Mock26;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class windowhandling {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		//act.contextClick().perform();
//		Robot r=new Robot();
//		//r.keyPress(KeyEvent.VK_PAGE_DOWN);
//		r.keyPress(KeyEvent.VK_PAGE_UP);
//		r.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.name("NewWindow")).click();
		Set<String> allwindowid = driver.getWindowHandles();
		for(String singlewinid:allwindowid)
		{
			System.out.println(singlewinid);
		}
		int allid = allwindowid.size();
		int i=0;
		  String []ar=new String[allid];
		  for(String s:allwindowid)
		  {
			  ar[i]=s;
		  }
		  
		
		driver.switchTo().window(ar[0]);
		driver.manage().window().maximize();
		WebElement box = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		JavascriptExecutor sc = (JavascriptExecutor)driver;
		sc.executeScript("arguments[0].value='love india';", box);
		WebElement contactmeButton = driver.findElement(By.xpath("(//span[@class='menu-text'])[1]"));
		Thread.sleep(500);
		contactmeButton.click();
		driver.findElement(By.xpath("(//i[@class='soc-icon fab fa-facebook-square'])[1]")).click();
		System.out.println();
		driver.switchTo().window(ar[1]);
		  driver.findElement(By.xpath("(//span[text()='Log In'])[2]")).click();
		 
		
	}

}
