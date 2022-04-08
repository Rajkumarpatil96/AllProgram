package KitePOMTESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage {
@FindBy(id="userid")private WebElement UserID;
@FindBy(id="password")private WebElement password;
@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;

public Kiteloginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void enterUserID(String Uid)
{
	UserID.sendKeys(Uid);
	
}
public void enterPassword(String pwd)
{
	password.sendKeys(pwd);
}
public void clickOnLoginButton()
{
	loginButton.click();
}
}
