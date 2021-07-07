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
import com.GH_GitLab.page.OfficeEmpOffer_Page1;
import com.GH_GitLab.page.OfficeEmpOffer_Page2;
import com.GH_GitLab.page.OfficeEmpOffer_Page3;
import com.GH_GitLab.utility.TestUtil;
import com.GH_GitLab.utility.TestXLUtility;

public class OfficeEmpOfferPageTest extends GreenHouse_Base {
	
	Login_Page1 log1;
	LoginPage2 log2;
	TestUtil util;
	HomePage hp;
	Field_CandidatePage democand;
	TestXLUtility ut;
	OfficeEmpOffer_Page1 offerp1;
	OfficeEmpOffer_Page2 offerp2;
	OfficeEmpOffer_Page3 offerp3;
	
	public OfficeEmpOfferPageTest() {
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
		offerp1 = new OfficeEmpOffer_Page1();
		offerp2 = new OfficeEmpOffer_Page2();
		offerp3 = new OfficeEmpOffer_Page3();	
	}
	
	@Test(dataProvider="LoginData")                             
	public void OfferTest(String candidatename, String type, String supervisor, String recruiter, String salary) throws InterruptedException, IOException {
		log1.enterEmail();
		Thread.sleep(4000);
		log2.enterPassword_Submit();
		Thread.sleep(2000);
		hp.clickAllCandidate();
		Thread.sleep(2000);
		offerp1.clickonSelectedCandidate(candidatename);
		Thread.sleep(2000);
		offerp2.offerToCandidate();
		offerp3.selectDate();
		offerp3.enterValueEmploymentType(type);
		offerp3.enterValueSupervisoryOrg(supervisor);
		offerp3.enterValueHiringRecruiter(recruiter);
		offerp3.enterSalary(salary);
		offerp3.clickSave();
	}
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException{
	String path = "C:\\Users\\ars_n\\eclipse-workspace\\GreenHouse\\src\\main\\java\\com\\GreenHouse\\testdata\\GreenHouseTestData.xlsx";

	ut = new TestXLUtility(path);
	
	int totalrows = ut.getRowCount("OfficeEmp_Offer");
	int totalcols = ut.getCellCount("OfficeEmp_Offer", 1);
	
	String logData [][] =new String[totalrows][totalcols];
	
	for(int i=1;i<=totalrows; i++) {
		for(int j=0; j<totalcols; j++) {
			logData [i-1][j] = ut.getCellData("OfficeEmp_Offer", i, j);
		}
	}
	return logData;
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	

}
