package com.salesforce.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.salesforce.base.ProjectsSpecificActions;

public class LoginPage extends ProjectsSpecificActions{
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}

	public LoginPage enterUserName(String uName) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
		return this;
		
}

	public LoginPage enterPassword(String pwd) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		return this;
	
	}
	
	
	public HomePage clickLogin() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		return new HomePage(driver);
		}
}