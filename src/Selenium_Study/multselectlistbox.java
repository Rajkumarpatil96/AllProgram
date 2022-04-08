package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multselectlistbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		WebElement multiselect = driver.findElement(By.xpath("//Select[@name='cars']"));
		Select s=new Select(multiselect);
		s.selectByIndex(1);
		s.selectByValue("opel");
		s.selectByVisibleText("Audi");
		Thread.sleep(200);
		s.deselectByIndex(3);
	}

}
