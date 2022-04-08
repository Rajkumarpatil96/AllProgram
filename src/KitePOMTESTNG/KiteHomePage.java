package KitePOMTESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	//Variable Declaration
@FindBy(xpath="//span[@class='user-id']")private WebElement UserId;
@FindBy(xpath="//a[@target='_self']")private WebElement logOutButton;
//Use Contructor-->Public
public KiteHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
//methods

public String getactualUserid()
{
	String actualUserId = UserId.getText();
	return actualUserId;
}
public void clickOnLogOutButton()
{
	UserId.click();
	logOutButton.click();
}
}
