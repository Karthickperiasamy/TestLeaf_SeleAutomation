package com.salesforce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.salesforce.base.ProjectsSpecificActions;

public class NewOpportunityPage extends ProjectsSpecificActions {

	
	public NewOpportunityPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public NewOpportunityPage enterName(String oppName) {
	driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(oppName);
	return this;
	}
	
	
	public NewOpportunityPage enterDate() {
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//span[text()='26']")).click();
		return this;
			}
	
	
	public NewOpportunityPage enterStage() {
		driver.findElement(By.xpath("//button[@id=\"combobox-button-246\"]")).click();
		driver.findElement(By.xpath("//span[text()='Needs Analysis']")).click();
		return this;
	}
	
	
	public ViewOpportunityPage clickSave() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(3000);
		return new ViewOpportunityPage(driver);
	}
	
	
	
	public NewOpportunityPage veifyNameError() throws InterruptedException {
		Thread.sleep(3000);
	System.out.println("Opportunity name error is: " + driver.findElement(By.xpath("(//label[contains(text(),'Opportunity Name')]/ancestor::lightning-input/div)[2]")).getText());
	return this;
	}
	
	public NewOpportunityPage verifyStageError() {
	System.out.println("Stage error is: " + driver.findElement(By.xpath("(//label[contains(text(),'Stage')]/ancestor::lightning-combobox/div)[2]")).getText());
	return this;
	}
	
}
