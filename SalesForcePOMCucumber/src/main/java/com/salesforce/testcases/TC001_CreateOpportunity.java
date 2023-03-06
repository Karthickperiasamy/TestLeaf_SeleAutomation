package com.salesforce.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.salesforce.base.ProjectsSpecificActions;
import com.salesforce.pages.LoginPage;

public class TC001_CreateOpportunity extends ProjectsSpecificActions  {

	

	@BeforeClass
	public void setData() {
		fileName = "CreateOpportunity";
	}
	
	
	
	
	@Test(dataProvider = "FetchData")
	public void runCreateOpportunity(String uName, String pwd, String oppName) throws InterruptedException{		
		new LoginPage().enterUserName(uName).
		enterPassword(pwd).
		clickLogin().
		clickToggle().
		clickViewAll().
		clickSales().
		clickOpportunities().
		clickNewOpportunity().
		enterName(oppName).
		enterDate().
		enterStage().
		clickSave().verifyOppportunityName();
		
		
		
	}
	
}
