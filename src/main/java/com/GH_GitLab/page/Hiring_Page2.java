package com.GH_GitLab.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GH_GitLab.base.GreenHouse_Base;

public class Hiring_Page2 extends GreenHouse_Base {

	@FindBy(xpath = "//*[contains(@id,'react-select-2--value')]")
	WebElement OpeningField;
	
	@FindBy(xpath = "//div[@id='react-select-2--option-0']")
	WebElement SelectValueInOpeningField;
	
	@FindBy(xpath = "//input[@id='keep_job_open_yes_field']")
	WebElement JobOpenField;
	
	@FindBy(xpath = "//span[text()='Save']")
	WebElement HiredSaveButton; 
	
	public Hiring_Page2() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOpeningField() throws InterruptedException {
		try {
			OpeningField.click();
			Thread.sleep(2000);
			SelectValueInOpeningField.click();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
	
	public void clickJobOpenField() throws InterruptedException {
		JobOpenField.click();
		Thread.sleep(3000);
	}
	
	public void clickHiredSaveButton() throws InterruptedException {
		HiredSaveButton.click();
		Thread.sleep(3000);
	}
	
	
	
	
	
}
