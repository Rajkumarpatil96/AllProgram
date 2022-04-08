package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Continuepagepom {
@FindBy(id="pin")private WebElement pin;
@FindBy(xpath="//button[@type='submit']")private WebElement ContinueButton;

public Continuepagepom(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void enterpin(String Pin1)
{
	pin.sendKeys(Pin1);
}
public void ClicOnContinueButton()
{
	ContinueButton.click();
}
}
