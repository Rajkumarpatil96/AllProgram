package KiteAppusingPOMDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitehomepage {
@FindBy(xpath="//span[@class='user-id']")private WebElement userId;
@FindBy(xpath="//a[@target='_self']")private WebElement logoutButton;

public kitehomepage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void validatetext(String username)
{
	String Actualtext = userId.getText();
		String Expectedtext = username;
		if(Actualtext.equals(Expectedtext))
		{
			System.out.println("test case is matching ,test case is pass");
		}else {
			System.out.println("Test case is not match, test case is fail");
		}
}
public void clickonuserid() throws InterruptedException
{
	
	userId.click();
	Thread.sleep(500);
	logoutButton.click();
}
}
