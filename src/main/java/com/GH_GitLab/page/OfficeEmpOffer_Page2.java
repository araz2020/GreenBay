package com.GH_GitLab.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GH_GitLab.base.GreenHouse_Base;

public class OfficeEmpOffer_Page2 extends GreenHouse_Base {
	
	@FindBy(xpath = "//a[contains(text(),'Offer Details')]")
	WebElement OfferDetail;
	
	@FindBy(xpath = "//a[contains(text(),'Create Offer')]")
	WebElement CreateOffer;
	
	
	public OfficeEmpOffer_Page2() {
		PageFactory.initElements(driver, this);
	}
	
	public void offerToCandidate() throws InterruptedException {
		OfferDetail.click();
		Thread.sleep(2000);
		CreateOffer.click();
		Thread.sleep(4000);
	}
	
	
	

}
