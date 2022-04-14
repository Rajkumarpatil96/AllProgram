package facebookPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLoginPOM {
@FindBy(xpath="//input[@name='email']")private WebElement Username;
@FindBy(xpath="//input[@type='password']")private WebElement Password;
@FindBy(xpath="//button[@type='submit']")private WebElement LoginButton;
@FindBy(xpath="(//button[@type='submit'])[2]")private WebElement popup;

public FBLoginPOM(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public void Senduserid(String email)
{
	Username.sendKeys(email);
}

public void sendpassword(String pass)
{
	Password.sendKeys(pass);
}

public void ClickOnLoginButton() throws InterruptedException
{Thread.sleep(500);
	LoginButton.click();
}
public void ClickOnPopup()
{
	popup.click();
}
}
