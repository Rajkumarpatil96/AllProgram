package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselector1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(3000);
		WebElement radiobutton1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
		boolean result = radiobutton1.isSelected();
		if(result) {
			System.out.println("radio button is already selected");
		}
		else {
			System.out.println("radio button is not selected ,please select the radio button");
		radiobutton1.click();
		Thread.sleep(2000);
		boolean result2 = radiobutton1.isSelected();
		System.out.println(result2);
		WebElement text = driver.findElement(By.id("autocomplete"));
		text.sendKeys("india");
		}
	}

}
