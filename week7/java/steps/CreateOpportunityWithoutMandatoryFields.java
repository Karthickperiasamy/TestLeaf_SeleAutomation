package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateOpportunityWithoutMandatoryFields extends BaseClass {

//	When Click Sales
//	And Click Opportunities
//	Then Click New Opportunity
//	And Enter close date
//	And Click on Save
//	Then Verify error for name and stage displayed
	
	@When("Click Sales")
	public void sales() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
	}

	@And("Click Opportunities")
	public void opportunities() throws InterruptedException {
			driver.findElement(By.xpath("//span[contains(text(),'Opportunities')]/ancestor::a//*[name()='svg']")).click();
			Thread.sleep(3000);
	}
	
	@Then("Click New Opportunity")
	public void newOpportunity() {
				Actions builder = new Actions(driver);		
				WebElement newOpp = driver.findElement(By.xpath("//span[text()='New Opportunity']"));
				builder.click(newOpp).perform();
	}
	
	@And("Enter close date")
	public void closeDate() {
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//span[text()='27']")).click();
	}
	
		

	@And("Click on save")
	public void save() {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
	
	@Then("Verify error for name and stage displayed")
	public void verifyError() throws InterruptedException {
		System.out.println("Opportunity name error is: " + driver.findElement(By.xpath("(//label[contains(text(),'Opportunity Name')]/ancestor::lightning-input/div)[2]")).getText());
		System.out.println("Stage error is: " + driver.findElement(By.xpath("(//label[contains(text(),'Stage')]/ancestor::lightning-combobox/div)[2]")).getText());
	}


}
