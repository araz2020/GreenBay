package com.GH_GitLab.page;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GH_GitLab.base.GreenHouse_Base;

public class OfficeEmpOffer_Page3 extends GreenHouse_Base {
	
	@FindBy(xpath = "//input[@id='start_date_field']")
	WebElement DateField;
	
	@FindBy(xpath = "//div[@class='CalendarMonth CalendarMonth--horizontal'][2]//td")
	List<WebElement> allDates;
	
	@FindBy(xpath = "(//*[contains(@class,'form-input-wrapper')]/div/div/span/div)[1]")
	WebElement ClickEmploymentType;
	
	@FindBy(xpath = "//input[contains(@id,'custom_field_4018364002')]")
	WebElement SendValueEmploymentType;
	
	@FindBy(xpath = "(//*[contains(@class,'form-input-wrapper')]/div/div/span/div)[3]")
	WebElement ClickSupervisoryOrg;
	
	@FindBy(xpath = "//input[contains(@id,'custom_field_4267140002')]")
	WebElement SendValueSupervisoryOrg;
	
	@FindBy(xpath = "(//*[contains(@class,'form-input-wrapper')]/div/div/span/div)[5]")
	WebElement ClickHiringRecruiter;
	
	@FindBy(xpath = "//*[@id='custom_field_4267196002']")
	WebElement SendHiringRecruiter;
	
	@FindBy(xpath = "(//input[contains(@id,'custom_field_4287494002')])[2]")
	WebElement Salary;
	
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	WebElement SaveButton;
	
	public OfficeEmpOffer_Page3() {
		PageFactory.initElements(driver, this);
	}
	
	public void selectDate() throws InterruptedException {
		DateField.click();
		Thread.sleep(2000);
		
		for(WebElement ele: allDates){
			String date=ele.getText();
			if(date.equalsIgnoreCase("10")){
			ele.click();
			break;}}
	}
	
	
	public void enterValueEmploymentType(String type) throws InterruptedException {
		ClickEmploymentType.click();
		Thread.sleep(2000);
		
		SendValueEmploymentType.sendKeys(type);
		SendValueEmploymentType.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		SendValueEmploymentType.sendKeys(Keys.ENTER);
	}
	
	public void enterValueSupervisoryOrg(String supervisor) throws InterruptedException {
		
		ClickSupervisoryOrg.click();
		Thread.sleep(2000);
		
		SendValueSupervisoryOrg.sendKeys(supervisor);
		SendValueSupervisoryOrg.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		SendValueSupervisoryOrg.sendKeys(Keys.ENTER);
	}
	
	public void enterValueHiringRecruiter(String recruiter) throws InterruptedException {
		ClickHiringRecruiter.click();
		Thread.sleep(2000);
		SendHiringRecruiter.sendKeys(recruiter);
		SendHiringRecruiter.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		SendHiringRecruiter.sendKeys(Keys.ENTER);
	}
	
	public void enterSalary(String salary) {
		Salary.sendKeys(salary);
	}
	
	public void clickSave() throws InterruptedException {
		SaveButton.click();
		Thread.sleep(8000);
	}
	
	

}
