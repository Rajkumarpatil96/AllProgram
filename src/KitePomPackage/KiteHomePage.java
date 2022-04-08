package KitePomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
@FindBy(xpath="//span[@class='user-id']")private WebElement userid;
@FindBy(xpath="//a[@target='_self']")private WebElement logoutButton;

public KiteHomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public String getuserid()
{
	String text = userid.getText();
	return text;
}
public void ClickOnLogOutButton()
{ userid.click();
	logoutButton.click();
}
}
