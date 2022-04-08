package HandlingmultipleElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablehandling3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		List<WebElement> Headers = driver.findElements(By.xpath("//table[@id='product']/tbody/tr[1]/th"));
	int totalcolumncount = Headers.size();
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='product']/tbody/tr"));
	int totalrowscount = rows.size();
	//outer loop always for rows
	for(int i=1;i<=totalrowscount;i++)
	{
		for(int j=1;j<=totalcolumncount;j++)//inner for loop always for column
		{
			if(i==1)
			{
				WebElement header1 = driver.findElement(By.xpath("//table[@id='product']/tbody/tr["+i+"]/th["+j+"]"));
			System.out.print(	header1.getText()+" ||");
			}else {
				WebElement rowdata = driver.findElement(By.xpath("//table[@id='product']/tbody/tr["+i+"]/td["+j+"]"));
			System.out.print(rowdata.getText()+" ||");
			}
			
		}
		System.out.println();
	}
	}

}
