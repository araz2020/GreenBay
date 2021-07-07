package com.GH_GitLab.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.GH_GitLab.base.GreenHouse_Base;

public class Offer_Page1 extends GreenHouse_Base {
	
	@FindBy(xpath = "//input[@id='search']")
	WebElement SearchCandidate;
	
	@FindBy(xpath = "//*[@class='name']/a")
	WebElement SelectCandidate;
	
	public Offer_Page1() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickonSelectedCandidate(String candidatename) throws InterruptedException {
		
		SearchCandidate.sendKeys(candidatename+"\n");
		Thread.sleep(3000);
		SelectCandidate.click();
		
	}
	
	
	
	

}
