package com.GH_GitLab;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.GH_GitLab.base.GreenHouse_Base;
import com.GH_GitLab.page.Field_CandidatePage;
import com.GH_GitLab.page.HomePage;
import com.GH_GitLab.page.LoginPage2;
import com.GH_GitLab.page.Login_Page1;
import com.GH_GitLab.utility.TestUtil;
import com.GH_GitLab.utility.TestXLUtility;

public class Office_CandidatePageTest extends GreenHouse_Base {
	
	Login_Page1 log1;
	LoginPage2 log2;
	TestUtil util;
	HomePage hp;
	
	Field_CandidatePage democand;
	TestXLUtility ut;
	
	public Office_CandidatePageTest() {
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
		
		
	}
	
	@Test(dataProvider="LoginData")                             
	public void candidPageTest(String job, String firstname, String lastname, String email) throws InterruptedException, IOException {
		log1.enterEmail();
		Thread.sleep(4000);
		log2.enterPassword_Submit();
		hp.addCandidate();
		democand.selectJobfromDD(job);
		Thread.sleep(2000);
		democand.enterName(firstname, lastname, email);
		Thread.sleep(8000);
		util.srollDown();
		democand.selectSourceFromList();
		democand.clicAddCandidate();
		
	}
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException{
	String path = "C:\\Users\\ars_n\\eclipse-workspace\\GreenHouse\\src\\main\\java\\com\\GreenHouse\\testdata\\GreenHouseTestData.xlsx";

	ut = new TestXLUtility(path);
	
	int totalrows = ut.getRowCount("Office_Emp");
	int totalcols = ut.getCellCount("Office_Emp", 1);
	
	String logData [][] =new String[totalrows][totalcols];
	
	for(int i=1;i<=totalrows; i++) {
		for(int j=0; j<totalcols; j++) {
			logData [i-1][j] = ut.getCellData("Office_Emp", i, j);
		}
	}
	return logData;
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
