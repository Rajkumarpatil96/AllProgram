package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validuser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("email"));
		 username.sendKeys("Raj123");
		 String Actualusername = username.getText();
		 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		 password.sendKeys("123456");
		 String Actualpassword = password.getText();
		 String expectedpassword = ("123456");
		 //WebElement loginbutton = driver.findElement(By.tagName("button"));
	String Expectedusername = ("Raj123");
	if(Actualusername.equals(Expectedusername))
	{
		System.out.println("username is correct,enter the password");
		Thread.sleep(2000);
		if(Actualpassword.equals(expectedpassword))
		{
			System.out.println("password is correct,click login buttion");
			WebElement loginbutton = driver.findElement(By.tagName("button"));
			Thread.sleep(3000);
			loginbutton.click();
			System.out.println("login succesfull");
		}else {
			System.out.println("please enter the correct the password");
		}
	}else
	{
		System.out.println("please enter valid username");
	}
	}
}
