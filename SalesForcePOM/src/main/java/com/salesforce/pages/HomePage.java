package com.salesforce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.salesforce.base.ProjectsSpecificActions;

public class HomePage extends ProjectsSpecificActions {
	
	
	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public HomePage clickToggle() {		
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		return this;
	}

	
	public HomePage clickViewAll() {
		driver.findElement(By.xpath("//button[contains(text(),\"View All\")]")).click();
		return this;
	}
	
	
	public SalesPage clickSales() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
		return new SalesPage(driver);
	} 
}
