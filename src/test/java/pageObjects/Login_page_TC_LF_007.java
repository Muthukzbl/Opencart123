package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class Login_page_TC_LF_007 extends BaseClass {
	
	WebDriver driver;
	public Login_page_TC_LF_007(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[contains(@class,'well')])[2]") WebElement Login_block;
	@FindBy(id="input-email") WebElement mail;
	@FindBy(id="input-password") WebElement password;
	public void Block()
	{
		
		Login_block.click();
	}
	
	public void tab(String value1) {
		String emails="E-Mail Address";
		
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		
		try
		{
		
			if(mail.equals(emails))
			{
				mail.sendKeys(value1);
				
			}
			
		}
		catch(Exception e)
		{
			
		}
		finally {
		
			mail.sendKeys(value1);
		}
		
	}
	
	
	public void tab2(String value2)	
	{
		
		String pwd="Password";
		Actions act=new Actions(driver);
		act.sendKeys(Keys.TAB).perform();
		
		try
		{
		
			if(pwd.equals(password))
			{
			password.sendKeys(value2);
				
			}
			
		}
		catch(Exception e)
		{
		
		}	
		finally
		{
			password.sendKeys(value2);
		}
		
		
}
	

}
