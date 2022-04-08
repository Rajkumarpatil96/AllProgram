package Selenium_Study;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowserpopup2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		WebElement NewWindow = driver.findElement(By.name("NewWindow"));
		NewWindow.click();
		Thread.sleep(2000);
		Set<String> allwindowid = driver.getWindowHandles();
		
		Iterator<String> it = allwindowid.iterator();
		
		System.out.println(it);
		//driver.switchTo().window("Ar.get()1");
		 String mainpageid = it.next();
		String childpageid = it.next();
		Thread.sleep(5000);
		driver.switchTo().window(childpageid);
		driver.manage().window().maximize();
		WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		textbox.sendKeys("Rajkumar");
		Thread.sleep(3000);
		driver.switchTo().window(mainpageid);
		Thread.sleep(2000);
		WebElement homebutton = driver.findElement(By.xpath("//input[@name='home']"));
		homebutton.click();
		WebElement iframe = driver.findElement(By.xpath("//a[text()='iFrames']"));
		iframe.click();
		driver.switchTo().frame("Frame1");
		WebElement frame1text = driver.findElement(By.xpath("//p[text()='I am inside Frame']"));
		String text = frame1text.getText();
		System.out.println(text);
		driver.switchTo().defaultContent();
		WebElement pavilianbutton = driver.findElement(By.xpath("//a[text()='Pavilion']"));
		pavilianbutton.click();
		
	}

}
