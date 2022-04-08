package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpagePom {
@FindBy(id="userid")private WebElement Userid;
@FindBy(id="password")private WebElement password;
@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;

public loginpagePom(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void EnterUserId(String Username)
{
	Userid.sendKeys(Username);
}
public void EnterPassword(String pass)
{
	password.sendKeys(pass);
}
public void ClicOnLoginButton()
{
	loginButton.click();
}
}
