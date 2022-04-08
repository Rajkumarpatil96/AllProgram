package Selenium_Study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class logo {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		WebElement closepopup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closepopup.click();
		 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 String name=RandomString.make(2);
		File dest=new File("C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium\\Screenshot\\flif "+name+".jpg");
		FileHandler.copy(source, dest);
		WebElement logo = driver.findElement(By.xpath("//div[@class='_3qX0zy']"));
		boolean result = logo.isDisplayed();
		boolean result1 = logo.isEnabled();
		String text = logo.getText();
		System.out.println(text);
		
		
		System.out.println(result);
		System.out.println(result1);
	}

}
