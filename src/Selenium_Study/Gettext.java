package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html\"");
		WebElement webele = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']"));
       // System.out.println(gettext);
		//System.out.println(webele.getText());
		String actualtext = webele.getText();
		System.out.println(actualtext);
		System.out.println(webele.getText());
		String expectedtext=("Welcome To Practice Page");
		if(actualtext.equals(expectedtext))
			
		{
			System.out.println("test case is matching ,test case is pass");
		}else {
			System.out.println("test case is not matching,test case fail");
			
		}
	}

}
