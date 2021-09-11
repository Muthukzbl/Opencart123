package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class Login_page_Invalid_email extends BaseClass {
	WebDriver driver;
	public Login_page_Invalid_email(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//*[text()[contains(.,' Warning: No match for E-Mail Address and/or Password.')]]") WebElement WarningMessage;
	
	public Boolean waring_msg()
	{
		try
		{
			return(WarningMessage.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	
}
