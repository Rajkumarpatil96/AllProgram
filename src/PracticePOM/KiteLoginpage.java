package PracticePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginpage {
	@FindBy(id="userid")private WebElement userId;
	@FindBy(xpath = "//input[@type='password']")private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginbutton;
	
	public KiteLoginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void Senduserid(String Id)
	{
		userId.sendKeys(Id);
	}
	public void Sendpassword(String pass)
	{
		Password.sendKeys(pass);
	}
	public void ClickOnLoginButton()
	{
		loginbutton.click();
	}
}
