package com.salesforce.base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.salesforce.utils.ReadExcel;




public class ProjectsSpecificActions {

	
	public ChromeDriver driver;
	public String fileName;

	
	@BeforeMethod
	public void preCondition() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		
		
	}


	@AfterMethod
	public void postCondition() {
	driver.close();
	}
	
	@DataProvider(name="FetchData", indices = 0)
	public String[][] sendData() throws IOException {
		return ReadExcel.readDataFromExcel(fileName);

	}
	
}
