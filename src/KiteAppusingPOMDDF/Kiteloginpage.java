package KiteAppusingPOMDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage {
@FindBy(id="userid")private WebElement UserId;
@FindBy(id="password")private WebElement password;
@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;

public Kiteloginpage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public void sendUserId(String uid)
{
	UserId.sendKeys(uid);
}
public void sendpassword(String pass)
{
	password.sendKeys(pass);
}
public void ClickOnloginButton()
{
	loginButton.click();
}
}
