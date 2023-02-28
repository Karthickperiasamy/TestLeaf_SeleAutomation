package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

//Then Click on Sales
//And Click on Opportunities
//And Click on New Opportunity
//And Enter the Name <Name>
//And Enter the CloseDate
//Then Select the action
//And Click Save
//Then Verify Opportunity successfully created


public class CreateNewOpportunity extends BaseClass{

	@Then("Click on Sales")
	public void clickSales() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(3000);
	}

	@And("Click on Opportunities")
	public void clickOpportunities() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Opportunities')]/ancestor::a//*[name()='svg']")).click();
		Thread.sleep(3000);
	}
	
	@And("Click on New Opportunity")
	public void clickNewOpportunity() {
		Actions builder = new Actions(driver);		
		WebElement newOpp = driver.findElement(By.xpath("//span[text()='New Opportunity']"));
		builder.click(newOpp).perform();
	}
	
	@And("Enter the Name as (.*)$")
	public void enterName(String name) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
	}
	
	@And("Enter the CloseDate")
	public void enterCloseDate() {
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//span[text()='26']")).click();
	}
	
	@Then("Select the action")
	public void selectAction() {
		driver.findElement(By.xpath("//button[@id=\"combobox-button-246\"]")).click();
		driver.findElement(By.xpath("//span[text()='Needs Analysis']")).click();
	}

	
	@And("Click Save")
	public void clickSave() {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
	
	
	@And("Verify Opportunity successfully created")
	public void verifySuccessful() throws InterruptedException {
		Thread.sleep(3000);
		String createdName = driver.findElement(By.xpath("//span[text()='Opportunity']/a/div")).getText();
		System.out.println("Opportunity name is " + createdName);		
		
	}
	
//	
//	
//

}


