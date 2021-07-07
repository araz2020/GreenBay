package com.GH_GitLab;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.GH_GitLab.base.GreenHouse_Base;
import com.GH_GitLab.page.LoginPage2;
import com.GH_GitLab.page.Login_Page1;
import com.GH_GitLab.utility.TestUtil;

public class LoginPageTest extends GreenHouse_Base {
	
	Login_Page1 log1;
	LoginPage2 log2;
	TestUtil util;
	Logger loger;
	
	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void seTup() {
		initialSteps();
		log1 = new Login_Page1();
		log2 = new LoginPage2();
		util = new TestUtil();
		
		loger = Logger.getLogger("LoginPageTest");
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	@Test(priority=1)
	
	public void loginpageTitletest() {
		String title = log1.verifyPageTitle();
		System.out.println("Page title is:  "+title);
		Assert.assertEquals(title, "Sign In | Greenhouse");
		
		                                                                  /* I can use SoftAssert:------------------->>>>
		                                                                     softAssert sassert = new softAssert(); 
                                                                             sassert.assertAll(); 
		                                                                  */
		
		                                                                  /* I can use if else as well:-------------------------------->>>
		                                                                     util.pageVerification_If_Else();
		                                                                     */
	}
	
	@Test(priority=2)                                                        //@Test(priority=1, enabled=false)
	public void loginTest() throws InterruptedException, IOException {
		
		log1.enterEmail();
		Thread.sleep(4000);
		loger.info("Email Address Entered");
		log2.enterPassword_Submit();
		loger.info("Password Entered");
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	

}
