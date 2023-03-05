package com.salesforce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.salesforce.base.ProjectsSpecificActions;

public class SalesPage extends ProjectsSpecificActions {
	
	public SalesPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public SalesPage clickOpportunities() throws InterruptedException { 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Opportunities')]/ancestor::a//*[name()='svg']")).click();
	Thread.sleep(3000);
	return this;
	}
	
	public NewOpportunityPage clickNewOpportunity() {
	Actions builder = new Actions(driver);		
	WebElement newOpp = driver.findElement(By.xpath("//span[text()='New Opportunity']"));
	builder.click(newOpp).perform();
	return new NewOpportunityPage(driver);
	}
	
	
}
