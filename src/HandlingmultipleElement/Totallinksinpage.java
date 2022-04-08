package HandlingmultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totallinksinpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> Alllinks = driver.findElements(By.tagName("a"));
		for(WebElement w:Alllinks)
		{
			System.out.println(w.getText());
		}
		System.out.println(Alllinks.size());
		Dimension d=new Dimension(100,200);
		driver.manage().window().setSize(d);
	}

}
