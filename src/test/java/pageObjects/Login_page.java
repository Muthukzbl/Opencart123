package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.BaseClass;

public class Login_page extends BaseClass {
	WebDriver driver;
	public Login_page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//span[contains(@class,'hidden-xs hidden-sm hidden-md')])[3]") WebElement Myaccount;
	@FindBy(xpath="//ul[contains(@class,'dropdown-menu dropdown-menu-right')]//li") List<WebElement> Myaccounts_options;
	@FindBy(id="input-email") WebElement mail;
	@FindBy(id="input-password") WebElement password;
	@FindBy(xpath="//input[contains(@type,'submit' ) and @value='Login']") WebElement Login;
	@FindBy(xpath="//h2[contains(text(),'My Account')]") WebElement title;
	
	
	
	public void myaccount()
	{
		Myaccount.click();
	}
	
	public void alloptions()
	{
	   
		for(WebElement all_opt:Myaccounts_options)
		{ 
			String ele=all_opt.getText();
			if(ele.equals("Login"))
			{
				all_opt.click();
				break;
			}
		}
	}
	
	public void entering_email(String email)
	{
		mail.sendKeys(email);
	}
	
	public void entering_password(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void login_account()
	{
		Login.click();
		
	}
	public boolean  Account_page()
	{
		try
		{
			return(title.isDisplayed());
		}
		catch(Exception e)
		{
			return(false);
		}
	}
	
	public void navigation()
	{
		driver.navigate().back();
	}
	
	

}
