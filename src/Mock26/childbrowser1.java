package Mock26;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowser1 {

	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		WebElement newWindowbutton = driver.findElement(By.xpath("//input[@name='NewWindow']"));
		newWindowbutton.click();
		Set<String> allwindowid = driver.getWindowHandles();
		System.out.println(allwindowid);
		Iterator<String> it = allwindowid.iterator();
		String mainpageid = it.next();
		String childpageid = it.next();
		Thread.sleep(2000);
		
		driver.switchTo().window(childpageid);
		driver.manage().window().maximize();
		WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		textbox.sendKeys("Vikram");
	
		Thread.sleep(2000);
		driver.switchTo().window(mainpageid);
		WebElement homebutton = driver.findElement(By.xpath("//input[@name='home']"));
		homebutton.click();
		WebElement Alertbutoon = driver.findElement(By.xpath("//a[text()='Alerts']"));
		Alertbutoon.click();
		WebElement submitbutton = driver.findElement(By.xpath("//input[@value='Submit']"));
		submitbutton.click();
		Thread.sleep(300);
		Alert Alt = driver.switchTo().alert();
		Alt.accept();
		Thread.sleep(300);
		WebElement promtmebutten = driver.findElement(By.xpath("//input[@value='PromptMe']"));
		promtmebutten.click();
		Alt.sendKeys("yOgesh");
		Thread.sleep(3000);
		Alt.accept();
		Thread.sleep(500);
		WebElement Confirmbutton = driver.findElement(By.xpath("//input[@id='confirm']"));
		Confirmbutton.click();
		Alt.accept();
		WebElement homebutton1 = driver.findElement(By.xpath("//input[@name='home']"));
		homebutton1.click();
		WebElement iframebuton = driver.findElement(By.xpath("//a[text()='iFrames']"));
		iframebuton.click();
		driver.switchTo().frame("Frame1");
		WebElement textchildframe = driver.findElement(By.xpath("//p[text()='I am inside Frame']"));
		String text = textchildframe.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		WebElement pavilianbutton = driver.findElement(By.xpath("//a[text()='Pavilion']"));
		pavilianbutton.click();
		Thread.sleep(2000);
		//driver.close();
//		WebElement demoframe = driver.findElement(By.xpath("(//span[text()='DemoForm'])[1]"));
//		demoframe.click();
		Set<String> Allid = driver.getWindowHandles();
		Iterator<String> it1 = Allid.iterator();
		String tabid = it1.next();
		
		//String tabid = it1.next();
		driver.switchTo().window(tabid);
		WebElement subcribebutton = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
		//driver.switchTo().window(text);
		Thread.sleep(3000);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		//j.executeScript("window.scrollBy(0,300)");
//		j.executeScript("window.scrollBy(0,-200)");
		j.executeScript("arguments[0].scrollIntoView();",subcribebutton);
		subcribebutton.click();
		
		driver.close();
//		
	}

}
