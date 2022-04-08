package Mock26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pracctice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login.php");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		String email = "institute@gmail.com";
		WebElement userId = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		 userId.sendKeys(email);
		password.sendKeys("181712");
		System.out.println(userId.getText());
			Thread.sleep(1000);
		WebElement yesContinuebButton = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		yesContinuebButton.click();
		String actualuserId = email;
		
		String expectetUserId="institute@gmail.com";
		if(actualuserId.equals(expectetUserId))
		{
			System.out.println("user id is matching test case is passed");
		}
		else {
			System.out.println("user id not matched test case is failed");
		}
		//loginButton.click();
	}

}
