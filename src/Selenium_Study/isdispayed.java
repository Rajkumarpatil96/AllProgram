package Selenium_Study;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdispayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(3000);
		WebElement hidebutten = driver.findElement(By.xpath("//input[@value='Hide']"));
			hidebutten.click();
			boolean result = hidebutten.isDisplayed();
			WebElement showbutten = driver.findElement(By.xpath("//input[@value='Show']"));
			
			showbutten.click();
			
			boolean result1 = showbutten.isDisplayed();
			System.out.println("show butten "+result1);
			
			
	}
}