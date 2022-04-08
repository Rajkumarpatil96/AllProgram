package KiteAppusingPOMDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ZerodhaWithPOM.kitepinpage;

public class Kitepinpage {
	@FindBy(id="pin")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement continueButton;
	
	public Kitepinpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Sendpin1(String pin1) 
	{
		pin.sendKeys(pin1);
	}
	public void ClickonButton()
	{
		continueButton.click();
	}

}
