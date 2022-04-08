package PracticePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitehomePage {
	@FindBy(xpath ="//span[@class='user-id']" )private WebElement userId;
	@FindBy(xpath = "//a[@target='_self']")private WebElement logoutButton;
	
	public KitehomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void validateUserId()
	{
		String expectedtext = "DAA677";
		String actualtext = userId.getText();
		//System.out.println(actualtext);
		if(actualtext.equals(expectedtext))
		{
			System.out.println("Test case is pass");
		}
		else {
			System.out.println("Test case is fail");
		}
	}
	public void clickOnlogoutButton() throws InterruptedException
	{
		userId.click();
		Thread.sleep(100);
		logoutButton.click();
	}

}
