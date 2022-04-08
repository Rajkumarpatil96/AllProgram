package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listboxhandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//1.Identify list box to be handled and store it in reference variable
		driver.get("https://www.facebook.com/");
		Thread.sleep(9000);
		WebElement newaccountbutton = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		newaccountbutton.click();
		Thread.sleep(2000);
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		firstname.sendKeys("vikram");
		Thread.sleep(200);
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("wagaj");
		Thread.sleep(1000);
		WebElement gmail = driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number')]"));
		gmail.sendKeys("vikram@gmail.com");
		WebElement reentergmail = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		reentergmail.isEnabled();
		 reentergmail.sendKeys("vikram@gmail.com");
		 
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		password.sendKeys("32513313");
		//1.Identify list box to be handled and store it in reference variable
		WebElement day = driver.findElement(By.id("day"));
		//2.Create an object of Select class which will accept WebElement as argument
		Select s=new Select(day);
		//3.By using one of the select class methods we can select values form list box like 
		s.selectByVisibleText("21");
		
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByValue("7");
		
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByIndex(23);
		
		WebElement Gender = driver.findElement(By.xpath("//input[@value='2']"));
		Gender.click();
		Thread.sleep(500);
		WebElement signinbutton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		signinbutton.click();
		
		
		
	}

}
