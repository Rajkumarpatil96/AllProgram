package Selenium_Study;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowserpopup1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		WebElement newwindowbutton = driver.findElement(By.xpath("//input[@name='NewWindow']"));
		newwindowbutton.click();
		Set<String> allwindowid = driver.getWindowHandles();
		System.out.println(allwindowid);
		driver.switchTo().window("CDwindow-8153302A29AEA0670F7488DD406DA091");
		Iterator<String> it = allwindowid.iterator();
		it.next();
		it.next();
		driver.manage().window().maximize();
		WebElement homebutton = driver.findElement(By.xpath("(//span[text()='HOME'])[1]"));
		homebutton.click();
	}

}
