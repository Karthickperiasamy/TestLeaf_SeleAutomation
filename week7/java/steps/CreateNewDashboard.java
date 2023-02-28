package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewDashboard extends BaseClass {
	
	Actions builder = new Actions(driver);
	
	@When("Click Dashboards")
	public void dashboard(){
		WebElement dashEle = driver.findElement(By.xpath("//p[text()='Dashboards']"));
		builder.click(dashEle).pause(Duration.ofSeconds(5)).perform();
	}

	@Then("Click New Dashboard")
	public void newDashboard(){
		driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
	}
	
	@And("Enter dashboard name")
	public void dashboardName(){
		WebElement iFrame = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(iFrame);
		String dashName = "Salesforce Automation by KARTHICK";
		driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys(dashName);
	}
	
	@And("Click Create")
	public void create() throws InterruptedException{
		driver.findElement(By.xpath("//button[text()='Create']")).click();
		driver.switchTo().defaultContent();
		//WebElement frameEle = driver.findElement(By.xpath("(//iframe)"));
		driver.switchTo().frame(0);
		Thread.sleep(3000);
			}

	
	@Then("Save")
	public void save(){
		 driver.findElement(By.xpath("//div[@class='slds-button-group']//button")).click();
			}
	
	
	@And("Verify Dashboard created")
	public void verify(){
            System.out.println(driver.findElement(By.xpath("//div[contains(@id,'toastDescription')]/span")).getText());      
		   

			}
}




//When Click Dashboards
//Then Click New Dashboard
//And Enter dashboard name
//And Click Create
//Then Choose Save
//And Verify Dashboard created

//
//
//#        driver.findElement(By.xpath("//button[text()='Create']")).click();
//#        driver.switchTo().defaultContent();
//#//        WebElement frameEle = driver.findElement(By.xpath("(//iframe)"));
//#        driver.switchTo().frame(0);
//#        Thread.sleep(3000);
//#        
//#        driver.findElement(By.xpath("//div[@class='slds-button-group']//button")).click();        
//#        System.out.println(driver.findElement(By.xpath("//div[contains(@id,'toastDescription')]/span")).getText());      
//#        String FinalDashName = driver.findElement(By.xpath("//label[text()= 'Edit Dashboard name']/following-sibling::div//span")).getText();
//#        if(dashName.equals(FinalDashName))System.out.println("Dashboard Successfully Created");
//#        else System.out.println("Unsuccessful");
