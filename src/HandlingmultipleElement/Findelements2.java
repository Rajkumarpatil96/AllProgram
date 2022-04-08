package HandlingmultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Honda");
		Thread.sleep(5000);
		List<WebElement> allsuggestion = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(allsuggestion.size());
		String ExpectedResult = "honda unicorn";
		for(WebElement W:allsuggestion)
		{
			String Actualtext = W.getText();
			
			System.out.println(Actualtext);
			//String ExpectedResult = "honda unicorn";
			if(Actualtext.equals(ExpectedResult))
			{Thread.sleep(2000);
				W.click();
				break;
			}
		
		}
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Images")).click();
	}

}
