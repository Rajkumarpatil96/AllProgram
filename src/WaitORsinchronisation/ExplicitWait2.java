package WaitORsinchronisation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manis\\OneDrive\\Desktop\\software testing.Raj\\Automation testing\\Selenium Tool\\chromedriver_win32\\chromedriver.exe");
//		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("Headless");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("vctcpune");
		Actions Act=new Actions(driver);
		Act.sendKeys(Keys.ENTER).perform();
		WebElement branch = driver.findElement(By.xpath("(//h3[contains(text(),'Velocity Corporate ')])[3]"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMillis(1000));
		wait.until(ExpectedConditions.visibilityOf(branch));
		Act.click(branch).perform();
		List<WebElement> ullimitedlist = driver.findElements(By.xpath("//div[@class='clearfix']//ul/li[@data-type='comment']"));
		System.out.println(ullimitedlist.size());
		for(WebElement w:ullimitedlist)
		{
			String text = w.getText();
			System.out.println(text);
		}
		System.out.println("============================================================================");
		WebElement rating = driver.findElement(By.xpath("//div[@id='comments_anchor']/div/div[contains(@class,'js-comments-total')]"));
		wait.until(ExpectedConditions.visibilityOf(rating));
		System.out.println(rating.getText());
	}

}
