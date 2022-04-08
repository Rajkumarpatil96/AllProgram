package popup;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class childbrowserpopup1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Set<String> Allwindowid = driver.getWindowHandles();
		ArrayList<String>arr=new ArrayList<String>(Allwindowid);
		String mainwindowid = arr.get(0);
		String childwindowid = arr.get(1);
		driver.switchTo().window(childwindowid);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Rajkumar");
		Thread.sleep(1000);
		driver.switchTo().window(mainwindowid);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='home']")).click();
		//Actions Act=new Actions(driver);
		WebElement webTablebutton = driver.findElement(By.xpath("//a[text()='WebTable']"));
		
		webTablebutton.click();
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table01']/thead/tr/th"));
		int totalcolumncount = headers.size();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table01']/tbody/tr"));
		int totalrowcount = rows.size();
		for(int i=0;i<=totalrowcount;i++) {
			//driver.findElement(By.xpath("//input[@type='checkbox']["+i+"]")).click();
			for(int j=0;j<=totalcolumncount;j++)
			{
				//driver.findElement(By.xpath("//input[@type='checkbox']["+i+"]")).click();
				if(i==0) {
					driver.findElement(By.xpath("//table[@id='table01']/thead/tr/th/input[@type='checkbox']")).click();
				WebElement header = driver.findElement(By.xpath("//table[@id='table01']/thead//th["+j+"]"));
				System.out.println(header.getText()+" ");
				}else {
					
					WebElement text = driver.findElement(By.xpath("//table[@id='table01']/tbody/tr["+i+"]/td["+j+"]"));
					System.out.println(text.getText()+" ||");
				}
			}
		}
		
		}
		}



