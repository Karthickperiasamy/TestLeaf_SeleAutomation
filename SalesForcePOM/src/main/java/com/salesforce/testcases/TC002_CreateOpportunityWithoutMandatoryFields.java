package com.salesforce.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.salesforce.base.ProjectsSpecificActions;
import com.salesforce.pages.LoginPage;
import com.salesforce.pages.NewOpportunityPage;

public class TC002_CreateOpportunityWithoutMandatoryFields extends ProjectsSpecificActions {
	
	

	@BeforeClass
	public void setData() {
		fileName = "CreateOppNoMand";
	}
	
	@Test(dataProvider = "FetchData")
	public void runCreateOpportunityWithoutMandatoryFields(String uName, String pwd) throws InterruptedException{
		
		new LoginPage(driver).
		enterUserName(uName).
		enterPassword(pwd).
		clickLogin().
		clickToggle().
		clickViewAll().
		clickSales().
		clickOpportunities().
		clickNewOpportunity().enterDate().clickSave();
		
		
		new NewOpportunityPage(driver).veifyNameError().verifyStageError();
		
	}

}
