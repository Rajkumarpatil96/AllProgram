package HandlingmultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("iphone 13 pro max");
		driver.findElement(By.className("_34RNph")).click();
		Thread.sleep(2000);
		 List<WebElement> text = driver.findElements(By.xpath("(//div//span[@class='_2_R_DZ'])[1]"));
			
			System.out.println(text.size());
			for(WebElement W:text)
			{
				String rating = W.getText();
				System.out.println(rating);
			}
	}

}
