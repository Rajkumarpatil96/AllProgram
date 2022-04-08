package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NESTEDFRAME {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		WebElement text1 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		String parent = text1.getText();
         System.out.println("text of parent frame "+parent);
         Thread.sleep(5000);
         WebElement child = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
         driver.switchTo().frame(child);
         WebElement text = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
         String text2 = text.getText();
         System.out.println("text of child frame "+text2 );
         
	}

}
