package popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowserpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		//String mainpageid = driver.getWindowHandle();
		WebElement newwindowbutton = driver.findElement(By.xpath("//input[@name='NewWindow']"));
		newwindowbutton.click();
		Set<String> allwindowid = driver.getWindowHandles();
		//System.out.println(allwindowid );
		Iterator<String> it = allwindowid.iterator();//pointing to -1
		String mainpageid = it.next();//pointing to 0 th location
		
		String childpageid = it.next();//pointing to 1 st locati0n
		//switch selenium focus to child page
		Thread.sleep(2000);
		driver.switchTo().window(childpageid);//focused switched form main page to child page
		driver.manage().window().maximize();
		WebElement textbox = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		textbox.sendKeys("kishor hattarge");
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(mainpageid);
		WebElement homebutton = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
		homebutton.click();
		WebElement signupformbutton = driver.findElement(By.xpath("//a[text()='SignUp Form']"));
		signupformbutton.click();
		Thread.sleep(2000);
		WebElement fullnametextbox = driver.findElement(By.id("username"));
		fullnametextbox.sendKeys("vikram balasaheb wagaj");
		WebElement emailtextbox = driver.findElement(By.xpath("//input[@id='email']"));
		emailtextbox.sendKeys("vikram9860@gmail.com");
	WebElement telephonetextbox = driver.findElement(By.xpath("//input[@id='tel']"));
	telephonetextbox.sendKeys("8669411496");
	driver.close();
		
		

	}

}
