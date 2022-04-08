package Mock26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomloginpage {
@FindBy(id="userid")private WebElement userid;
@FindBy(xpath="//span[@class='su-message']")private WebElement UserIdErrorMessage;
@FindBy(id="password")private WebElement password;
@FindBy(xpath="(//span[@class='su-message'])[2]")private WebElement passwordErrorMessage;
@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
@FindBy(xpath="//p[@class='error text-center']")private WebElement invalidPassworderrormessage;

public Pomloginpage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void enterUserid()
{
	userid.sendKeys("DAA677");
	password.sendKeys("velocity");
}



public void ClickOnloginButton()
{
	loginButton.click();
}
public String getErrorText()
{
	String text = UserIdErrorMessage.getText();
	return text;
	
}
public String getErrorpasstext()
{
	String passerror = passwordErrorMessage.getText();
	return passerror;
}
public String geterrorinvalidPWD() throws InterruptedException
  {  
	String invalidpasstext = invalidPassworderrormessage.getText();
	return invalidpasstext;
}

}
