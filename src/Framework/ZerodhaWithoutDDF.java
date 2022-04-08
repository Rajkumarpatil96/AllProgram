package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaWithoutDDF {//without datadriven framework

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		WebElement useridField = driver.findElement(By.id("userid"));
		WebElement passwordfield = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		useridField.sendKeys("DAA677");
		passwordfield.sendKeys("Velocity@123");
		loginButton.click();
		Thread.sleep(1000);
		WebElement pinField = driver.findElement(By.id("pin"));
		WebElement continueButton = driver.findElement(By.xpath("//button[@type='submit']"));
		pinField.sendKeys("866918");
		continueButton.click();
		Thread.sleep(1000);
		WebElement userId = driver.findElement(By.className("user-id"));
		String actualuserId = userId.getText();
		String expectedUserid = "DAA677";
		if(actualuserId.equals(expectedUserid))
		{
			System.out.println(" Test case is matching,Test case pass");
		}else {
			System.out.println(" Test case is not matching, test case is fail");
		}
		
	}

}
