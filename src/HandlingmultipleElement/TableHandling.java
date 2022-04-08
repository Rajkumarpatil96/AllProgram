package HandlingmultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		List<WebElement> tableHeader = driver.findElements(By.xpath("//table/tbody/tr/th"));
		System.out.println(tableHeader.size());
		for(WebElement o:tableHeader)
		{
			  System.out.print(o.getText()+" ||");
		}
		List<WebElement> tablerow = driver.findElements(By.xpath("//table/tbody/tr"));
		tablerow.size();
		for(int i=0;i<=10;i++)
		{
			WebElement rows = tablerow.get(i);
			System.out.println(rows.getText()+" ||");
		}
	}

}
