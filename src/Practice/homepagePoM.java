package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepagePoM {
@FindBy(xpath="//span[@class='user-id']")private WebElement UserId;
@FindBy(xpath="//a[@target='_self']")private WebElement logOutButton;

public homepagePoM(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public String getUserid()
{
String text = UserId.getText();
return text;
}
public void ClicOnlogoutButton()
{
	UserId.click();
	logOutButton.click();
}
}
