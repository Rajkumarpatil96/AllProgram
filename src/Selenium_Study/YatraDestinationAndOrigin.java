package Selenium_Study;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class YatraDestinationAndOrigin {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notification");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		act.contextClick().perform();
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.linkText("Hotels")).click();
		WebElement search = driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]"));
		act.click(search).perform();
		List<WebElement> cities = driver.findElements(By.xpath("//div/ul[@class='clearfix']//div//ul//div/li"));
for(WebElement w:cities)
{
	String ActualCities = w.getText();
	System.out.println(ActualCities);
	String expectedcities = "P";
	if(ActualCities.equals(expectedcities))
	{
		String text = w.getText();
		System.out.println(text);
	}
}
	}

}
