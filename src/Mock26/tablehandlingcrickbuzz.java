package Mock26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablehandlingcrickbuzz {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/40361/1st-odi-australia-tour-of-pakistan-2022");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("//div[contains(@class,'cb-col cb-col-67 cb-scrd-')]"));
		System.out.println(table.getText());
	}

}
