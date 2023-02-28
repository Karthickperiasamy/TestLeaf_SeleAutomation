package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CreateIndividual extends BaseClass{
	

//	#Given Open the Browser
//	#And Launch the URL
//	#When Enter the username as <Username> and password as <password>
//	When Enter the username as <Username>
//	And Enter the password as <Password>
//	And Click on Login
//	Then Click on Toggle Menu
//	Then Click on View All
//	Then Click on Individuals
//	And Click on New
//	Then Enter the Last Name as <LName>
//	And Click on Save
//	Then Individual should be saved successfully
	
	
//	
//	@When("Enter the username as (.*)$")
//	public void enterUsername(String uName) {
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
//	}
//	
//	@And("Enter the password as (.*)$")
//	public void enterPassword(String pwd) {
//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pwd);
//	}
//	
//	
//	@And("Click on Login")
//    public void clickLogin() {
//	driver.findElement(By.xpath("//input[@id='Login']")).click();
//	}
//
//	
//	@Then("Click on Toggle Menu")
//	public void clickToggleMenu() {
//	driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
//
//	}
//	
//	@Then("Click on View All")
//	public void clickViewAll() {
//	driver.findElement(By.xpath("//button[contains(text(),\"View All\")]")).click();
//
//	}
	
	@Then("Click on Individuals")
	public void clickIndividuals() {
		Actions builder = new Actions(driver);		
		WebElement dashEle = driver.findElement(By.xpath("//p[text()='Individuals']"));
		builder.click(dashEle).pause(Duration.ofSeconds(5)).perform();

	}

	@And("Click on New")
	public void clickNew() {
		driver.findElement(By.xpath("//div[text()= 'New']")).click();
		}
	

	@Then("Enter the Last Name as (.*)$")
	public void enterLName(String LName) {
	driver.findElement(By.xpath("//span[text()='Last Name']/parent::label/following-sibling::input")).sendKeys(LName);
		}
	
	@And("Click on Save")
	public void clickSave() {
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		}
	
	
	@Then("Individual should be saved successfully")
	public void IndividualSaved() {
	System.out.println(driver.findElement(By.xpath("//span[@data-aura-class=\"forceActionsText\"]")).getText());
		}
	
	
}	

//		driver.findElement(By.xpath("//button[contains(text(),\"View All\")]")).click();
//		Actions builder = new Actions(driver);		
//		WebElement dashEle = driver.findElement(By.xpath("//p[text()='Individuals']"));
//		builder.click(dashEle).pause(Duration.ofSeconds(5)).perform();
//		driver.findElement(By.xpath("//div[text()= 'New']")).click();
//		driver.findElement(By.xpath("//span[text()='Last Name']/parent::label/following-sibling::input")).sendKeys("Kumar");
//		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
//		System.out.println(driver.findElement(By.xpath("//span[@data-aura-class=\"forceActionsText\"]")).getText());
//		
//		
//				//driver.close();
	//}


