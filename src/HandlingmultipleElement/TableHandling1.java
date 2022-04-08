package HandlingmultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		List<WebElement> header = driver.findElements(By.xpath("//table[@id='product']/tbody/tr[1]/th"));
		int columncount = header.size();
		
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='product']/tbody/tr"));
		int rowcount = row.size();
		
		for(int i=1;i<=rowcount;i++)
		{		
			for(int j=1;j<=columncount;j++)
			{
				if(i==1)
				{
					WebElement header1 = driver.findElement(By.xpath("//table[@id='product']/tbody/tr["+i+"]/th["+j+"]"));
					String headert1ext = header1.getText();
					System.out.print(headert1ext+ " ||");
					
				}else {
					WebElement rows = driver.findElement(By.xpath("//table[@id='product']/tbody/tr["+i+"]/td["+j+"]"));
					String rowtext = rows.getText();
					System.out.print(rowtext +" ||");
				}
				
			}
			System.out.println();
	}

	}
}
