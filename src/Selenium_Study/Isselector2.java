package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselector2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	Thread.sleep(2000);
	WebElement radio1button = driver.findElement(By.xpath("//input[@value='Radio1']"));
	//radio1button.click();
	boolean result = radio1button.isSelected();
	if(result)
	{
		System.out.println("button is already selected");
	}
	else {
		System.out.println("button is not selected ,please select the button now");
		radio1button.click();
		boolean result2 = radio1button.isSelected();
		System.out.println("updated result is "+result2);
		
	}
	}

}
