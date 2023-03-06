package com.salesforce.pages;

import org.openqa.selenium.By;

import com.salesforce.base.ProjectsSpecificActions;

public class NewOpportunityPage extends ProjectsSpecificActions {

	
//	public NewOpportunityPage(ChromeDriver driver) {
//		this.driver = driver;
//	}
	
	public NewOpportunityPage enterName(String oppName) {
		getDriver().findElement(By.xpath("//input[@name='Name']")).sendKeys(oppName);
	return this;
	}
	
	
	public NewOpportunityPage enterDate() {
		getDriver().findElement(By.xpath("//input[@name='CloseDate']")).click();
		getDriver().findElement(By.xpath("//span[text()='26']")).click();
		return this;
			}
	
	
	public NewOpportunityPage enterStage() {
		getDriver().findElement(By.xpath("//button[@id=\"combobox-button-246\"]")).click();
		getDriver().findElement(By.xpath("//span[text()='Needs Analysis']")).click();
		return this;
	}
	
	
	public ViewOpportunityPage clickSave() throws InterruptedException {
		getDriver().findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(3000);
		return new ViewOpportunityPage();
	}
	
	
	
	public NewOpportunityPage veifyNameError() throws InterruptedException {
		Thread.sleep(3000);
	System.out.println("Opportunity name error is: " + getDriver().findElement(By.xpath("(//label[contains(text(),'Opportunity Name')]/ancestor::lightning-input/div)[2]")).getText());
	return this;
	}
	
	public NewOpportunityPage verifyStageError() {
	System.out.println("Stage error is: " + getDriver().findElement(By.xpath("(//label[contains(text(),'Stage')]/ancestor::lightning-combobox/div)[2]")).getText());
	return this;
	}
	
}
