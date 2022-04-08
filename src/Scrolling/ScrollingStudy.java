package Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		WebElement checkboxoptbutton = driver.findElement(By.id("checkBoxOption1"));
		 
		j.executeScript("window.scrollBy(100,2000)");
		// +ve x value--> right hand side, Y value +ve --> down 
				// +ve x value--> right hand side, Y value -ve --> up 
				// -ve x value--> left hand side, Y value +ve --> down 
				// -ve x value--> left hand side, Y value -ve --> up
		Thread.sleep(2000);
		j.executeAsyncScript("window.scrollBy(0,1000)");
		//j.executeScript("arguments[0].scrollIntoView(true);",checkboxoptbutton);
		//checkboxoptbutton.click();
	}

}
