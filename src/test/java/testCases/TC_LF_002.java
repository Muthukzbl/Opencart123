package testCases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login_page;
import pageObjects.Login_page_Invalid_email;
import testBase.BaseClass;

public class TC_LF_002 extends BaseClass {
	
	@Test(priority=1)
	public void Loin_with_valid_and_Invalid_email_address()
	{
		
		driver.get(rb.getString("appURL"));
		driver.manage().window().maximize();
		Login_page lp=new Login_page(driver);
		lp.myaccount();
		lp.alloptions();
		lp.entering_email((rb.getString("Invalid_email")));
		lp.entering_password((rb.getString("password")));
		lp.login_account();
			
		
	}
	@Test(priority=2)
	public void invalid_validation()
	{
		Login_page_Invalid_email im=new Login_page_Invalid_email(driver);
		boolean warning =im.waring_msg();
		if(warning)
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.fail();
		}
	}
	

}
