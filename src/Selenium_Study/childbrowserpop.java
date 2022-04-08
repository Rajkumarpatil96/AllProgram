package Selenium_Study;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowserpop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		WebElement newwindowbutton = driver.findElement(By.xpath("//input[@name='NewWindow']"));
		newwindowbutton.click();
		Thread.sleep(2000);
		Set<String> allpagewindowid = driver.getWindowHandles();
		//System.out.println(allpagewindowid);
		ArrayList<String> Ar=new ArrayList(allpagewindowid);
		 String mainpageid = Ar.get(0);
		 String childpageid = Ar.get(1);
		 driver.switchTo().window(childpageid);
		 driver.manage().window().maximize();
		 WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		 textbox.sendKeys("Rajkumar");
		 Thread.sleep(2000);
		 driver.switchTo().window(mainpageid);
		 WebElement Homebutton = driver.findElement(By.xpath("//input[@name='home']"));
		 Homebutton.click();
		WebElement Alertbutton = driver.findElement(By.xpath("//a[text()='Alerts']"));
		Alertbutton.click();
		WebElement submitbutton = driver.findElement(By.xpath("//input[@value='Submit']"));
		submitbutton .click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(300);
	alt.accept();
	
	}

}
