package KitePomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteloginPage {
@FindBy(id="userid")private WebElement userid;
@FindBy(id="password")private WebElement password;
@FindBy(xpath="//button[@type='submit']")private WebElement LoginButton;
@FindBy(xpath="(//span[@class='su-message'])[2]")private WebElement passErrorMessage;
@FindBy(xpath="(//span[@class='su-message'])[1]")private WebElement useridErrorMessage;


public KiteloginPage(WebDriver driver)
{
	
	
	PageFactory.initElements(driver, this);
	
}

public void enteruserid(String username)
{
	userid.sendKeys(username);
}
public void enterpassword(String pwd)
{
	password.sendKeys(pwd);
}
public void ClockOnLoginButton()
{
	LoginButton.click();
}
public String getpassErrorMessage()
{
	String text = passErrorMessage.getText();
	return text;
}
public String getuseridErrorMessage()
{
	String useridErrormsg = useridErrorMessage.getText();
	return useridErrormsg;
}
}
