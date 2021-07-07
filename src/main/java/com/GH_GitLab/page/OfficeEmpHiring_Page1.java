package com.GH_GitLab.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GH_GitLab.base.GreenHouse_Base;

public class OfficeEmpHiring_Page1 extends GreenHouse_Base {

	@FindBy(xpath = "//a[contains(text(),'Offer Details')]")
	WebElement OfferDetail;
	
	@FindBy(xpath = "//a[contains(text(),'Mark Candidate as Hired')]")
	WebElement MarkCandidateAsHired;
	
	public OfficeEmpHiring_Page1() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickMarkCandidateAsHired() throws InterruptedException {
		OfferDetail.click();
		Thread.sleep(2000);
		MarkCandidateAsHired.click();
		Thread.sleep(4000);
	}
	
	
	
	
	
	
	
	
}
