package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettextuse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'people in your life.')]"));
		String actualtext = text.getText();
		String Expectedtext = ("Facebook helps you connect and share with the people in your life.");
		if(actualtext.equals(Expectedtext))
		{
			System.out.println("test case is matching,test case pass");
		}else
		{
			System.out.println("test case is not matching test case is fail");
		}
	}

}
