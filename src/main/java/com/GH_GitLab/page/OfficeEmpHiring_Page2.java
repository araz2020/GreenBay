package com.GH_GitLab.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GH_GitLab.base.GreenHouse_Base;

public class OfficeEmpHiring_Page2 extends GreenHouse_Base {

	@FindBy(xpath = "//span[text()='Save']")
	WebElement HiredSaveButton; 
	
	public OfficeEmpHiring_Page2() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickHiredSaveButton() throws InterruptedException {
		HiredSaveButton.click();
		Thread.sleep(3000);
	}
	
	
	
	
	
}
