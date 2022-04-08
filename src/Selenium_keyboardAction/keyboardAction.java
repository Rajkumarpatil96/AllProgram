package Selenium_keyboardAction;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardAction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement createAcountbutton = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		Actions Act=new Actions(driver);
		Thread.sleep(2000);
		Act.click(createAcountbutton).perform();
		Thread.sleep(2000);
		Act.keyDown(Keys.SHIFT).sendKeys("velocity").build().perform();
		Act.keyUp(Keys.SHIFT).perform();
		Act.sendKeys(Keys.TAB).keyDown(Keys.SHIFT).sendKeys("corporate").build().perform();
		Act.keyUp(Keys.SHIFT).perform();
		Act.sendKeys(Keys.TAB).perform();
		Act.sendKeys("9874563210").perform();
		Act.sendKeys(Keys.TAB).sendKeys("haaaaaa").build().perform();
		Act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
		for(int i=0;i<10;i++)
		{
			Act.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(200);
		}
		Act.sendKeys(Keys.TAB).perform();
		for(int i=0;i<10;i++)
		{
			Act.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(200);
		}
		Act.sendKeys(Keys.TAB).perform();
		for(int i=0;i<10;i++)
		{
			Act.sendKeys(Keys.ARROW_DOWN).build().perform();
			Thread.sleep(200);
		}
		Act.sendKeys(Keys.TAB).perform();
		
		Act.sendKeys(Keys.TAB).perform();
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
		Act.click(gender).perform();
//		Act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).click().build().perform();
		Act.sendKeys(Keys.ENTER).perform();
	}

}
