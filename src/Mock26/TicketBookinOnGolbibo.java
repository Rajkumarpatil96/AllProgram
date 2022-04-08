package Mock26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TicketBookinOnGolbibo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@role='presentation'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9665657531");
		WebElement continueButton = driver.findElement(By.xpath("//input[@type='button']"));
		Thread.sleep(1000);
		//boolean result = continueButton.isEnabled();
		
		
			continueButton.click();
		
		WebElement fullname = driver.findElement(By.xpath("//input[@name='fullName']"));
		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		
	}

}
