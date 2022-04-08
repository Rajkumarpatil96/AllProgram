package Mock26;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MT26 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		WebElement Homebutton = driver.findElement(By.xpath("(//input[@class='btn'])[1]"));
		Homebutton.click();
		driver.findElement(By.xpath("//a[text()='iFrames']")).click();
		driver.findElement(By.xpath("//a[text()='Pavilion']")).click();
	Thread.sleep(6000);
	Set<String> allid = driver.getWindowHandles();
//		Iterator<String> it = allid.iterator();
//		String mainpageid = it.next();
//		String childpageid = it.next();
	Vector <String>v=new Vector<>(allid );
		   String mainpageid = v.get(0);
		   String childpageid = v.get(1);
		driver.switchTo().window(childpageid);
		
		
		WebElement Emailtext = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
	
	JavascriptExecutor Scroll = (JavascriptExecutor)driver;
		Scroll.executeScript("arguments[0].scrollIntoView;",Emailtext);
		Thread.sleep(4000);
		Emailtext.sendKeys("raj@gmail.com");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	}

}
