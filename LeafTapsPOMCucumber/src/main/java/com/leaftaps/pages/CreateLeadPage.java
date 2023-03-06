package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.base.ProjectSpecificActions;

public class CreateLeadPage extends ProjectSpecificActions {

//	public CreateLeadPage(RemoteWebDriver driver) {
//		this.driver = driver;
//	}

	public CreateLeadPage enterCompanyName(String cName) {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		return this;
	}

	public CreateLeadPage enterFirstName(String fName) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
	}

	public CreateLeadPage enterLastName(String lName) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
	}

	public ViewLeadPage clickCreateLead() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
}
