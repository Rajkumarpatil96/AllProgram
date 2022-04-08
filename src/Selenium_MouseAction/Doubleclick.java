package Selenium_MouseAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		WebElement Elementbutton = driver.findElement(By.xpath("//div[@class='element-group'][1]"));
		Elementbutton.click();
		Thread.sleep(1000);
		WebElement button = driver.findElement(By.id("item-4"));
		button.click();
		Thread.sleep(2000);
		
		
		WebElement doubleclickbutton = driver.findElement(By.id("doubleClickBtn"));
		//create object of Actions class passing the object of chromedriver pass as argument
		Actions Act=new Actions(driver);
		Act.doubleClick(doubleclickbutton).perform();
	}

}
