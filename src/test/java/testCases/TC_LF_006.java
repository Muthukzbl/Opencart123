package testCases;

import org.testng.annotations.Test;

import pageObjects.Login_page;
import pageObjects.Loign_Page_TC_LF_006;
import testBase.BaseClass;

public class TC_LF_006 extends BaseClass{
	
	@Test(priority=1)
	public void Login()
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
	public void Forget_password()
	{
		Loign_Page_TC_LF_006 fp=new Loign_Page_TC_LF_006(driver);
		fp.forget_pwd();
		fp.forget_pwd_button();
		fp.forget_pwd_message();
	}
	

}
