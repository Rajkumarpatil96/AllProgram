package ZerodhaWithPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitehomepage {
//variable declaration---->Webelement
	@FindBy(xpath="//span[@class='user-id']")private WebElement userId;
	@FindBy(xpath="//a[@target='_self']")private WebElement logOut;
	
	//use consructor--->public
	public Kitehomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods which work on the datamembers
	public void validateUserId()
	{
		String actualUserId = userId.getText();
		String expectedUserId = "DAA677";
		if(actualUserId.equals(expectedUserId))
		{
			System.out.println("Test case is matching,Test case is pass");
		}
		else{
			System.out.println("Test case is not matching,test case is fail");
		}
	}
	public void ClickOnLogoutButton() throws InterruptedException
	{
		userId.click();
		Thread.sleep(500);
		logOut.click();
	}
}
