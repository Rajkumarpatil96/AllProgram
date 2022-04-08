package ZerodhaWithPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kiteloginpage {
//variable declaration------>Webelement
	//syntax---->@findBy(locator type="locator value")private webelement variable name;
	@FindBy(id="userid")private WebElement userId;
	@FindBy(id="password")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
	
	//Use the Constructor-->access specifier as a Public
	public Kiteloginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods Which works on data members
	public void sendUserID()
	{
		userId.sendKeys("DAA677");
	}
	public void sendPassword()
	{
		password.sendKeys("Velocity@123");
	}
	public void loginButton() throws InterruptedException
	{ 
		
		loginButton.click();
	}
}
