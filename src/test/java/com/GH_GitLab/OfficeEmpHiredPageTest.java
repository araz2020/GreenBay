package com.GH_GitLab;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GH_GitLab.base.GreenHouse_Base;
import com.GH_GitLab.page.Field_CandidatePage;
import com.GH_GitLab.page.Hiring_Page1;
import com.GH_GitLab.page.Hiring_Page2;
import com.GH_GitLab.page.HomePage;
import com.GH_GitLab.page.LoginPage2;
import com.GH_GitLab.page.Login_Page1;
import com.GH_GitLab.page.Offer_Page1;
import com.GH_GitLab.utility.TestUtil;
import com.GH_GitLab.utility.TestXLUtility;

public class OfficeEmpHiredPageTest extends GreenHouse_Base {
	Login_Page1 log1;
	LoginPage2 log2;
	TestUtil util;
	HomePage hp;
	Field_CandidatePage democand;
	TestXLUtility ut;
	Offer_Page1 offerp1;
	Hiring_Page1 hirep1;
	Hiring_Page2 hirep2;
	
	public OfficeEmpHiredPageTest() {
		super();
	}
	@BeforeMethod
	public void seTup() {
		initialSteps();
		log1 = new Login_Page1();
		log2 = new LoginPage2();
		util = new TestUtil();
		hp = new HomePage();
		democand = new Field_CandidatePage();
		offerp1 = new Offer_Page1();
		hirep1 = new Hiring_Page1();
		hirep2 = new Hiring_Page2();
	}
	
	@Test(dataProvider="LoginData")                             
	public void HiredPTest(String candidatename) throws IOException, InterruptedException {
		log1.enterEmail();
		Thread.sleep(4000);
		log2.enterPassword_Submit();
		Thread.sleep(2000);
		hp.clickAllCandidate();
		Thread.sleep(2000);
		offerp1.clickonSelectedCandidate(candidatename);
		Thread.sleep(2000);
		hirep1.clickMarkCandidateAsHired();
		hirep2.clickHiredSaveButton();
		
	}
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException{
	String path = "C:\\Users\\ars_n\\eclipse-workspace\\GreenHouse\\src\\main\\java\\com\\GreenHouse\\testdata\\GreenHouseTestData.xlsx";

	ut = new TestXLUtility(path);
	
	int totalrows = ut.getRowCount("OfficeEmpHired");
	int totalcols = ut.getCellCount("OfficeEmpHired", 1);
	
	String logData [][] =new String[totalrows][totalcols];
	
	for(int i=1;i<=totalrows; i++) {
		for(int j=0; j<totalcols; j++) {
			logData [i-1][j] = ut.getCellData("OfficeEmpHired", i, j);
		}
	}
	return logData;
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	

}
