package com.leaftaps.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.leaftaps.base.ProjectSpecificActions;

import io.cucumber.java.en.Given;

public class LoginPage extends ProjectSpecificActions {
	
//	public LoginPage(RemoteWebDriver driver) {
//		this.driver = driver;
//	}

	@Given("Enter the username as (.*)$")
	public LoginPage enterUserName(String uName) {
		getDriver().findElement(By.id("username")).sendKeys(uName);
		return this;
	}

	@Given("Enter the password as (.*)$")
	public LoginPage enterPassword(String pwd) {
		getDriver().findElement(By.id("password")).sendKeys(pwd);
		return this;
	}

	@Given("Click on Login")
	public HomePage clickLogin() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new HomePage();
	}
}
