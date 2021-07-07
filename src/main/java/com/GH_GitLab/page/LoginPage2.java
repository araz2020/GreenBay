package com.GH_GitLab.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GH_GitLab.base.GreenHouse_Base;

public class LoginPage2 extends GreenHouse_Base {
	
	
	@FindBy(id="user_password")
	WebElement PasswordField;
	
	@FindBy(id="user_remember_me")
	WebElement CheckBox;
	
	@FindBy(xpath="//body[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[6]/button[1]/span[1]")
	WebElement ClickSubmitButton;
		
	
	public LoginPage2() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterPassword_Submit() throws InterruptedException {
		
		PasswordField.sendKeys(prop.getProperty("password"));
		Thread.sleep(2000);
		CheckBox.click();
		ClickSubmitButton.click();
		
	}

}
