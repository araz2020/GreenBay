package com.GH_GitLab.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GH_GitLab.base.GreenHouse_Base;

public class HomePage extends GreenHouse_Base {

	@FindBy(id = "new_candidate_menu_toggle")
	WebElement PlusSignButton;

	@FindBy(xpath = "//a[contains(text(),'Add a Candidate')]")
	WebElement CandCreate;

	@FindBy(xpath = "//*[text()='Create a Job']")
	WebElement CreateJob;

	@FindBy(xpath = "//a[contains(text(),'All Candidates')]")
	WebElement AllCandidates;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public void ClickPlusSign() {
		Actions act = new Actions(driver);
		act.moveToElement(PlusSignButton).build().perform();
		CreateJob.click();
	}

	public void addCandidate() {
		Actions act = new Actions(driver);
		act.moveToElement(PlusSignButton).build().perform();
		CandCreate.click();
	}

	public void clickAllCandidate() {
		AllCandidates.click();
	}

}
