package ZerodhaWithPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitepinpage {
//variable declaration------>Webelement
	@FindBy(id="pin")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement continueButton;
	
	//Use the ConStructor which has access Specifier is Public
	public kitepinpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Method Which Work on data member
	public void sendpin()
	{
		pin.sendKeys("866918");
	}
	public void clickOnContinuebutton()
	{
		continueButton.click();
	}
}
