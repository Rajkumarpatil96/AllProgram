package Selenium_Study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(2000);
		WebElement clickmebutton = driver.findElement(By.id("alertButton"));
		clickmebutton.click();
		Alert alt = driver.switchTo().alert();
		  alt.accept();
		  Thread.sleep(2000);
		  WebElement timerclickme = driver.findElement(By.id("timerAlertButton"));
		  timerclickme.click();
		  Thread.sleep(7000);
		  Alert alt1 = driver.switchTo().alert();
		  alt1.accept();
		  Thread.sleep(2000);
		  WebElement confirmbutton = driver.findElement(By.id("confirmButton"));
		  confirmbutton.click();
		  Alert alt2 = driver.switchTo().alert();
		  Thread.sleep(2000);
		  alt2.dismiss();
		  WebElement promtButton = driver.findElement(By.id("promtButton"));
		  promtButton.click();
		  Alert alt3 = driver.switchTo().alert();
		  alt3.sendKeys("Raj");
		  Thread.sleep(2000);
		  alt3.accept();
		  
		  
		
	}

}
