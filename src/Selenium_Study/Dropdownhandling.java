package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//1.Identify list box to be handled and store it in reference variable
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		WebElement newaccountbutton = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		newaccountbutton.click();
		Thread.sleep(3000);
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Rajkumar");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Patil");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9870654321");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("kdhhskjhf");
		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		//s.selectByValue("29");
		day.click();
		for(int i=0;i<=17;i++)
		{//day.click();
			Thread.sleep(200);
			s.selectByIndex(i);
		}
		
		
	}

}
