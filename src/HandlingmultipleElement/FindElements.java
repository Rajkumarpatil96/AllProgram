package HandlingmultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	static int  i;
	public static  void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		List<WebElement> checklist = driver.findElements(By.xpath("//input[contains(@id,'ohrmList_chkSelectRecord')]"));
		int size = checklist.size();
		//WebElement ind = checklist.get(size);
		
		for(WebElement w:checklist)
		{
			
			//Thread.sleep(200);
		driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectAll']")).click();
			

		Thread.sleep(200);
				w.click();
			
			
		}
	}

}
