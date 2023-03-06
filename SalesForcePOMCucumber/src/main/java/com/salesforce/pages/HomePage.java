package com.salesforce.pages;

import org.openqa.selenium.By;

import com.salesforce.base.ProjectsSpecificActions;

public class HomePage extends ProjectsSpecificActions {
	
	
//	public HomePage(ChromeDriver driver) {
//		this.driver = driver;
//	}
	
	public HomePage clickToggle() {		
		getDriver().findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;
	}

	
	public HomePage clickViewAll() {
		getDriver().findElement(By.xpath("//button[contains(text(),\"View All\")]")).click();
		return this;
	}
	
	
	public SalesPage clickSales() throws InterruptedException {
		getDriver().findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
		return new SalesPage();
	} 
}
