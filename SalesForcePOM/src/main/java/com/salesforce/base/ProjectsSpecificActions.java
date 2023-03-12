package com.salesforce.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.salesforce.utils.ReadExcel;




public class ProjectsSpecificActions {

	
	public ChromeDriver driver;
	public String fileName;
	public static Properties prop2;

	
	@BeforeMethod
	public void preCondition() throws IOException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		
		Properties prop = new Properties();		
		FileInputStream fis = new FileInputStream("src/main/resources/config.properties");		
		prop.load(fis);		
		prop.getProperty("Lang");
		
		Properties prop2 = new Properties();		
		FileInputStream fis2 = new FileInputStream("src/main/resources/" + prop.getProperty("Lang") + ".properties");		
		prop2.load(fis2);		
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
