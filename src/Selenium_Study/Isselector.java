package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselector {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		WebElement check = driver.findElement(By.name("checkBoxOption1"));
		boolean result = check.isSelected();
		if(result)
		{
			System.out.println("check box is already selected");
		}
		else {
			System.out.println("check box is not selectyed,select the checkbox now");
			check.click();
			Thread.sleep(2000);
			boolean result2 = check.isSelected();
			System.out.println(result2);
		}
	}

}
