import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setposition {

	
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\11thBMorning\\chromedriver_win32\\chromedriver.exe");

				WebDriver driver= new ChromeDriver();
				driver.get("https://skpatro.github.io/demo/links/");
				Thread.sleep(3000);
				//to get default position
				System.out.println(driver.manage().window().getPosition());
				//1. to change position create object of Point class which will accept x and y co-ordinates 
				Point k= new Point(70, 90);
				
				//2. use SetPosition which will accept object of point class
				
			//driver.manage().window().setPosition(k);
			}

		}
		
	}

}
