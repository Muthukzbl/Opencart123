package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.Login_page;
import testBase.BaseClass;


public class Login_TC_01 extends BaseClass {
	@Test
	public void Login()
	{
		driver.get(rb.getString("appURL"));
		driver.manage().window().maximize();
		Login_page lp=new Login_page(driver);
		lp.myaccount();
		lp.alloptions();
		lp.entering_email((rb.getString("email")));
		lp.entering_password((rb.getString("password")));
		lp.login_account();
		boolean target=lp.Account_page();
		if(target)
		{
	
		Assert.assertTrue(true);
		
		
		}
		else
		{
			Assert.fail();
		}
		
	}

}
