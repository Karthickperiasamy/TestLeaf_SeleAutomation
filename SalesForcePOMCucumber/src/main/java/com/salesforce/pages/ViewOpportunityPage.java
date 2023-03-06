package com.salesforce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.salesforce.base.ProjectsSpecificActions;

public class ViewOpportunityPage extends ProjectsSpecificActions {

//	public ViewOpportunityPage(ChromeDriver driver) {
//		this.driver = driver;
//	}
	
	public ViewOpportunityPage verifyOppportunityName() {
		
	String createdName = getDriver().findElement(By.xpath("//span[text()='Opportunity']/a/div")).getText();
	System.out.println("Opportunity name is" + createdName);		
	return this;
	}
}
