package Selenium_Study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		WebElement clickme1 = driver.findElement(By.id("alertButton"));
		clickme1.click();
		Thread.sleep(2000);
		Alert alt1 = driver.switchTo().alert();
		String text1 = alt1.getText();
		
		System.out.println(text1);
		alt1.accept();
		Thread.sleep(1000);
		//Alert alt2 = driver.switchTo().alert();
		
		WebElement clickme2 = driver.findElement(By.id("timerAlertButton"));
		clickme2.click();
		Thread.sleep(6000);
		Alert alt2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alt2.accept();
		WebElement clickme3 = driver.findElement(By.id("confirmButton"));
		clickme3.click();
		Thread.sleep(1000);
		Alert alt3 = driver.switchTo().alert();
		alt3.dismiss();
		WebElement clickme4 = driver.findElement(By.id("promtButton"));
		clickme4.click();
		Thread.sleep(1000);
		Alert alt4 = driver.switchTo().alert();
		alt4.sendKeys("yogesh");
		alt4.accept();
	}

}
