
// Code Stuck after clicking create button
package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CreateNewDashboard{

	@Test
	public void main() throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[contains(text(),\"View All\")]")).click();
		Actions builder = new Actions(driver);		
		WebElement dashEle = driver.findElement(By.xpath("//p[text()='Dashboards']"));
		builder.click(dashEle).pause(Duration.ofSeconds(5)).perform();
		driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
		WebElement iFrame = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(iFrame);
		String dashName = "Salesforce Automation by KARTHICK";
		driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys(dashName);
        driver.findElement(By.xpath("//button[text()='Create']")).click();
        driver.switchTo().defaultContent();
//        WebElement frameEle = driver.findElement(By.xpath("(//iframe)"));
        driver.switchTo().frame(0);
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//div[@class='slds-button-group']//button")).click();        
        System.out.println(driver.findElement(By.xpath("//div[contains(@id,'toastDescription')]/span")).getText());      
        String FinalDashName = driver.findElement(By.xpath("//label[text()= 'Edit Dashboard name']/following-sibling::div//span")).getText();
        if(dashName.equals(FinalDashName))System.out.println("Dashboard Successfully Created");
        else System.out.println("Unsuccessful");
        
//		Thread.sleep(3000);
//		String createdName = driver.findElement(By.xpath("//span[text()='Opportunity']/a/div")).getText();
//		System.out.println("Opportunity name is" + createdName);		
//		if(actualName.equals(createdName))System.out.println("Successful Opportunity creation");
//		else System.out.println("Unsuccessful");
		//driver.close();
	}

}



/*
 *  Test Steps: 
 *  1. Login to https://login.salesforce.com 
 *  2.Click on the toggle menu button from the left corner 
 *  3. Click View All and click Dashboards from App Launcher
 *  4. Click on the New Dashboard option 
 *  5.Enter Name as 'Salesforce Automation by *Your Name* ' and Click on Create.
 * 6.Click on Save and Verify Dashboard name."
 * 
 * Refer Step Vi	deo:
 * https://drive.google.com/file/d/1mlZPIYFk53kNnlvcx4cHkhc4IoxXLIhq/view?usp=
 * sharing"
 */
