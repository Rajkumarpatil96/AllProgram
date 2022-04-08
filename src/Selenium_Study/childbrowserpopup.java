package Selenium_Study;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class childbrowserpopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Set<String> mainpagewindowid = driver.getWindowHandles();//will give windowID in string form
		System.out.println(mainpagewindowid);
		WebElement newtab = driver.findElement(By.xpath("//input[@name='NewTab']"));
		newtab.click();
		Set<String> allpagewindowid = driver.getWindowHandles();
		System.out.println(allpagewindowid);
	}

}
