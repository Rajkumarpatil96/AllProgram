package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendivhandledpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement closepopup = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		closepopup.click();
		Thread.sleep(2000);
		WebElement cartbutton = driver.findElement(By.xpath("//a[@class='_3SkBxJ']"));
		cartbutton.click();
	}

}
