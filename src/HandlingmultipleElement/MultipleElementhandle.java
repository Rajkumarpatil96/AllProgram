package HandlingmultipleElement;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElementhandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement searchbar = driver.findElement(By.xpath("//input[@title='Search']"));
		searchbar.sendKeys("Honda");
		Thread.sleep(1000);
		List<WebElement> allSuggestion = driver.findElements(By.xpath("//div//ul[1]//li[@role='presentation']"));
//		Iterator<WebElement> it = allSuggestion.iterator();
//		while(it.hasNext())
		Thread.sleep(2000);
		System.out.println(allSuggestion.size());
		for(WebElement W:allSuggestion)
		
		{
		
	                  String Actualtext = W.getText();
	                  System.out.println(Actualtext);
	              String Expectedresult = "honda amaze";
	              if(Actualtext.equals(Expectedresult))
	              {
	            	  W.click();
	            	  break;
	            	  
	              }
	              
		}
		driver.findElement(By.linkText("Images")).click();
		
	}

}
