package com.leaftaps.base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.leaftaps.utils.ReadExcel;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificActions extends AbstractTestNGCucumberTests {

	private static final ThreadLocal<RemoteWebDriver> tlDriver = new ThreadLocal<RemoteWebDriver>();
	
	// Encapsulation
	// Hiding the data
	// Use getters and setters
	public void setDriver(RemoteWebDriver driver) {
		tlDriver.set(driver);
	}
	
	public RemoteWebDriver getDriver() {
		return tlDriver.get();
	}
	
//	public static RemoteWebDriver driver;
	public String fileName;

	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
		setDriver(new ChromeDriver());
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void postCondition() {
		getDriver().close();
	}

	@DataProvider(name = "FetchData", parallel = true)
	public String[][] sendData() throws IOException {
		return ReadExcel.readDataFromExcel(fileName);
	}
}
