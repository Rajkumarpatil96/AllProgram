package PracticePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinpage {
	@FindBy(id="pin")private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continueButton;
	
	public KitePinpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void Sendpin(String pin1)
	{
		pin.sendKeys(pin1);
	}
	public void clickOnContinueButton()
	{
	continueButton.click();	
	}

}
