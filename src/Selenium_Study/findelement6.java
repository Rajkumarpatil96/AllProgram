package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelement6 {

	//private static Object ;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		//driver.findElement(By.linkText("Forgotten account?")).click();
		driver.findElement(By.id("email")).sendKeys("kjshhdggsh");
		//driver.findElement(By.className("inputtext _55r1 inputtext _1kbt _9ay4 inputtext _1kbt")).sendKeys("1234");
		  //WebElement username = driver.findElement(By.id("email"));
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("email"));
		  username.clear();
		  username.sendKeys("raj");
		  driver.findElement(By.name("pass")).sendKeys("jkhsggdha");
		  driver.findElement(By.tagName("button")).click();
		
	}

}
