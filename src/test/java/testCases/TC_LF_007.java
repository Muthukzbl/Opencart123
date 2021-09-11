package testCases;

import org.testng.annotations.Test;

import pageObjects.Login_page;
import pageObjects.Login_page_TC_LF_007;
import testBase.BaseClass;

public class TC_LF_007 extends BaseClass{
	
	
	@Test(priority=1)
	public void tab() throws InterruptedException
	{
		
		driver.get(rb.getString("appURL"));
		driver.manage().window().maximize();
		Login_page lp=new Login_page(driver);
		Login_page_TC_LF_007 tb=new Login_page_TC_LF_007(driver);
		
		lp.myaccount();
		lp.alloptions();
		tb.Block();
		Thread.sleep(5000);
		tb.tab((rb.getString("email")));
		Thread.sleep(5000);
		tb.tab2((rb.getString("password")));
		Thread.sleep(5000);
		lp.login_account();
		
	}

}
