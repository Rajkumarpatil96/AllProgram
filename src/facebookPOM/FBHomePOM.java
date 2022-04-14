package facebookPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBHomePOM {
@FindBy(xpath="(//div[@role='button'])[3]")private WebElement downButton;
@FindBy(xpath="(//div[contains(@class,'ow4ym5g4 auili1gw rq0escxv j83agx80 buofh1pr ')])[28]//span[text()='Rajkumar Patil']")private WebElement Username;
@FindBy(xpath="(//div[@class='l9j0dhe7 du4w35lb rq0escxv j83agx80 cbu4d94t d2edcug0 d8ncny3e buofh1pr g5gj957u tgvbjcpo cxgpxx05']//div[@data-nocookies='true'])")private WebElement logoutButton;

public  FBHomePOM(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void ClickDownButton()
{
	downButton.click();
}
public String getusername()
{ 
	String text = Username.getText();
	return text;
}
 public void ClickOnlogout()
 {
	 
	 logoutButton.click();
 }

}
