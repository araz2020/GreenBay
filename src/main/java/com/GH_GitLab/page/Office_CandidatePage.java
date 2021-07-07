package com.GH_GitLab.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GH_GitLab.base.GreenHouse_Base;

public class Office_CandidatePage extends GreenHouse_Base {
	
	@FindBy(xpath="//body/div[@id='wrapper']/div[@id='person_form_wrapper']/form[@id='new_person']/div[@id='container']/div[1]/div[1]/div[1]/div[1]/div[3]/div[3]/div[1]/a[1]/span[2]/b[1]")
	WebElement ClickJobBox;
	
	@FindBy(xpath="//input[@id='s2id_autogen8_search']")
	WebElement SelectJob;
	
	@FindBy(xpath="//input[@id='person_first_name']")
	WebElement FirstName;
	
	@FindBy(xpath="//input[@id='person_last_name']")
	WebElement LastName;
	
	@FindBy(xpath="//a[@id='activate-email']")
	WebElement ClickEmail;
	
	@FindBy(xpath="//input[contains(@id,'email_0')]")
	WebElement EmailField;
	
	@FindBy(xpath="//span[contains(text(),'Select a source...')]")
	WebElement ClickSource;
	
	@FindBy(xpath="//tbody/tr[@id='source_id_row']/td[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement SelectSource;
	
	@FindBy(xpath="//input[@id='save']")
	WebElement AddCandidate;
	
	@FindBy(xpath="//body/div[@id='large-wrapper']/div[1]/div[2]/a[1]")
	WebElement AddAsNewCandidate;
	
	
	
	public Office_CandidatePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectJobfromDD(String job) throws InterruptedException {
		ClickJobBox.click();
		SelectJob.sendKeys(job);
		Thread.sleep(4000);
		SelectJob.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		SelectJob.sendKeys(Keys.ENTER);
	}

	public void enterName(String firstname, String lastname, String email) {
		FirstName.sendKeys(firstname);
		LastName.sendKeys(lastname);
		
		ClickEmail.click();
		EmailField.sendKeys(email);
	}
	
	
	public void selectSourceFromList() throws InterruptedException {
		ClickSource.click();
		SelectSource.sendKeys("Internal Applicant");
		Thread.sleep(4000);
		SelectSource.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(4000);
		SelectSource.sendKeys(Keys.ENTER);
	
	}
	
	public void clicAddCandidate() throws InterruptedException {
		AddCandidate.click();
		Thread.sleep(2000);
		try {
			AddAsNewCandidate.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
