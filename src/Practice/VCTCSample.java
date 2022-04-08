package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VCTCSample {
  @Test
  public void TC() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().window().maximize();
	  WebElement textbox = driver.findElement(By.id("autocomplete"));
	  textbox.sendKeys("pune");
	 boolean result = textbox.isDisplayed();
	  Assert.assertTrue(result, "Textbox is not null");
	 WebElement text = driver.findElement(By.xpath("//input[@id='name']"));
	 String text1 = text.getText();
	  Assert.assertNotNull(text1,"textbox is  null");
  }
  @Test
  public void TC1()
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  String Actualtitle = driver.getTitle();
	  String expectedtitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	  Assert.assertEquals(Actualtitle, expectedtitle,"Title is not matching");
  }
}
