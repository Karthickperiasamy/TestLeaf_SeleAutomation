package com.salesforce.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.salesforce.base.ProjectsSpecificActions;

public class LoginPage extends ProjectsSpecificActions{
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
		PageFactory.initElements (driver,this);
		
	}

	
	@FindBy(how = How.ID, using = "username") 
	WebElement eleUserName;
	
	//@FindAll({@FindBy()}, {@FiandBy()});
	//@CacheLookup
	
	public LoginPage enterUserName(String uName) {
		//WebElement eleUserName = driver.findElement(By.xpath("//input[@id='username']"));
		eleUserName.sendKeys(uName);
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