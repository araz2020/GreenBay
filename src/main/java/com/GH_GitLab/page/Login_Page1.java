package com.GH_GitLab.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GH_GitLab.base.GreenHouse_Base;

public class Login_Page1 extends GreenHouse_Base {
	
	
	@FindBy(id="user_email")     
	WebElement UserNameField;
	
	@FindBy(id="submit_email_button")
	WebElement Email_Submit;
	
	public Login_Page1() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPageTitle() {
		
		return driver.getTitle();
	}
	
	public void enterEmail() throws InterruptedException {
		
		UserNameField.sendKeys(prop.getProperty("username"));
		Thread.sleep(2000);
		Email_Submit.click();
	}

}
