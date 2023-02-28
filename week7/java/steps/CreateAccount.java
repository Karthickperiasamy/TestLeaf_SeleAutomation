package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccount extends BaseClass {
	Actions builder = new Actions(driver);
//	When Click Accounts
//	Then Click New Account
//	And Enter username
//	And Select dropdown
//	Then Choose Save
//	And Verify Account Name
	
	@When("Click Accounts")
    public void clickAccounts() throws InterruptedException {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Accounts']/parent::a/following-sibling::one-app-nav-bar-item-dropdown//*[name()='svg']")).click();
		Thread.sleep(3000);
	}

	@Then("Click New Account")
    public void newAccount() throws InterruptedException {
		WebElement newAcc = driver.findElement(By.xpath("//span[text()='New Account']"));
		builder.click(newAcc).pause(Duration.ofSeconds(5)).perform();
		Thread.sleep(3000);

	}
	
	@And("Enter username")
    public void userName() throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Karthick");
		Thread.sleep(3000);
	}

	@And("Select dropdown")
	public void selectDd() throws InterruptedException {
		builder.scrollByAmount(0, 300);
		WebElement dropDown = driver.findElement(By.xpath("(//span[text()='--None--'])[4]"));
		driver.executeScript("arguments[0].click()", dropDown);
		//builder.click(dropDown).pause(Duration.ofSeconds(5)).perform();
		WebElement value = driver.findElement(By.xpath("(//span[text()='Public']"));
		builder.click(value).pause(Duration.ofSeconds(5)).perform();
		Thread.sleep(3000);
	}
	
	@Then("Choose Save")
    public void chooseSave() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(3000);
	}
	
	@And("Verify Account Name")
    public void accName() {
		System.out.println(driver.findElement(By.xpath("//span[text()='Account']/a")).getText());
		
	}
	
}

//
//