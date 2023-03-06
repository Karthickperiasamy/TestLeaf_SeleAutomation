package com.salesforce.base;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.salesforce.utils.ReadExcel;

import io.cucumber.testng.AbstractTestNGCucumberTests;




public class ProjectsSpecificActions extends AbstractTestNGCucumberTests {

	
	private static final ThreadLocal<ChromeDriver> tlDriver = new ThreadLocal<ChromeDriver>();
	
	public void setDriver() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		tlDriver.set(new ChromeDriver(options));
	}

	public ChromeDriver getDriver() {
		return tlDriver.get();
	}
	
	//public static ChromeDriver driver;
	public String fileName;

	
	@BeforeMethod
	public void preCondition() {
		
		
		setDriver();
		getDriver().manage().window().maximize();
		getDriver().get("https://login.salesforce.com");
		
		
	}


	@AfterMethod
	public void postCondition() {
		getDriver().close();
	}
	
	@DataProvider(name="FetchData", indices = 0)
	public String[][] sendData() throws IOException {
		return ReadExcel.readDataFromExcel(fileName);

	}
	
}
