package testCases;

import org.testng.annotations.Test;

import pageObjects.Login_page;
import testBase.BaseClass;

public class TC_LF_009 extends BaseClass {

	
	@Test(priority=1)
	public void backword()
	{
		driver.get(rb.getString("appURL"));
		driver.manage().window().maximize();
		Login_page lp=new Login_page(driver);
		lp.myaccount();
		lp.alloptions();
		lp.entering_email((rb.getString("email")));
		lp.entering_password((rb.getString("password")));
		lp.login_account();
		lp.navigation();
		
			
		
		
	}
}
