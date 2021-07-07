package com.GH_GitLab;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.GH_GitLab.base.GreenHouse_Base;
import com.GH_GitLab.page.HomePage;
import com.GH_GitLab.page.LoginPage2;
import com.GH_GitLab.page.Login_Page1;
import com.GH_GitLab.utility.TestUtil;

public class HomePageTest extends GreenHouse_Base {
	Login_Page1 log1;
	LoginPage2 log2;
	TestUtil util;
	HomePage hp;
	
	
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	public void seTup() {
		initialSteps();
		log1 = new Login_Page1();
		log2 = new LoginPage2();
		util = new TestUtil();
		hp = new HomePage();
				
	}
	@Test(priority=1)                             
	public void homePageTest() throws InterruptedException, IOException {
		
		log1.enterEmail();
		Thread.sleep(4000);
		log2.enterPassword_Submit();
		hp.ClickPlusSign();
	}
		
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	

}
