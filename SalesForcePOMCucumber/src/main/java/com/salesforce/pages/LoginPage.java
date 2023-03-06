package com.salesforce.pages;

import java.time.Duration;

import org.openqa.selenium.By;

import com.salesforce.base.ProjectsSpecificActions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectsSpecificActions{
	
//	public LoginPage(ChromeDriver driver) {
//		this.driver = driver;
//	}

	@When("Enter the username as (.*)$")
	public LoginPage enterUserName(String uName) {
		getDriver().findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
		return this;
		
}
	@And("Enter the password as (.*)$")
	public LoginPage enterPassword(String pwd) {
		getDriver().findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
		return this;
	
	}
	
	@And("Click on Login")
	public HomePage clickLogin() {
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		getDriver().findElement(By.xpath("//input[@id='Login']")).click();
		return new HomePage();
		}
}