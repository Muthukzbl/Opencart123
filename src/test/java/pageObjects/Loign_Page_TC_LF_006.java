package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class Loign_Page_TC_LF_006 extends BaseClass{

	WebDriver driver;
	public Loign_Page_TC_LF_006(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//a[text()[contains(.,'Forgotten Password')]])[1]") WebElement Forget_password;
	@FindBy(xpath="//h1[text()[contains(.,'Forgot Your Password?')]]") WebElement Text_Fogert_msg;
	
	
	public boolean forget_pwd()
	{
		try
		{
			return(Forget_password.isDisplayed());
			
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	public void forget_pwd_button()
	{
		Forget_password.click();
	}
	
	public boolean forget_pwd_message()
	{
		try
		{
			return(Text_Fogert_msg.isDisplayed());
					
		}
		catch(Exception e)
		{
			
		return(false);
		}
	}
}
