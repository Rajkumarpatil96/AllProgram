package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;

public class keyboardaction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement createAccountbutton = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createAccountbutton.click();
	Thread.sleep(2000);
		WebElement firstName = driver.findElement(By.name("firstname"));
	
		Actions Act=new Actions(driver);
		Act.click(firstName).keyDown(Keys.SHIFT).sendKeys("velocity").sendKeys(Keys.ENTER).build().perform();
		WebElement lastname = driver.findElement(By.name("lastname"));
//		Thread.sleep(3000);
		//Actions A=new Actions(driver);
		Act.click(lastname).keyDown(Keys.SHIFT).sendKeys("Corporate").sendKeys(Keys.ENTER).build().perform();
		WebElement mobileno = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		Act.click(mobileno).keyUp(Keys.SHIFT).sendKeys("9874563212").sendKeys(Keys.ENTER).build().perform();
//		//lastname.sendKeys("kjhgg");
		WebElement newpassword = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		Act.click(newpassword).keyDown(Keys.SHIFT).sendKeys("velocity").sendKeys(Keys.ENTER).build().perform();
//		//Act.click(newpassword).K(Keys.SHIFT).sendKeys("velocity").build().perform();
//		WebElement age = driver.findElement(By.xpath("//input[@name='birthday_age']"));
//		Act.click(age).sendKeys("12/12/2022").build().perform();
		WebElement dateofbirthbutton = driver.findElement(By.xpath("(//a[@role='button'])[5]"));
		Act.click(dateofbirthbutton).perform();
		WebElement day = driver.findElement(By.name("birthday_day"));
		Act.click(day).perform();
		for(int i=0;i<12;i++)
		{
			Act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(200);
		}
		Act.sendKeys(Keys.ENTER).perform();
		WebElement month = driver.findElement(By.id("month"));
		Act.click(month).perform();
		for(int i=0;i<5;i++)
		{
			Act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(200);
		}
		Act.sendKeys(Keys.ENTER).perform();
		WebElement year = driver.findElement(By.id("year"));
		Act.click(year).perform();
		for(int i=0;i<23;i++)
		{
			Act.sendKeys(Keys.ARROW_DOWN).perform();
			//Act.sendKeys(Keys.ARROW_UP).perform();
			Thread.sleep(200);
		}
		Act.sendKeys(Keys.ENTER).perform();
		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		Act.click(gender).perform();
		WebElement signupbutton = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		Act.click(signupbutton).perform();
		//Act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).build().perform();
	}

}
