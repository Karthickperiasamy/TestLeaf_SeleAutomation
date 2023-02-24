
//Output not expected

package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteLead extends BaseClass{

	@Test(priority=2,enabled = false)
	public void deleteLead() throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("999");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String currentUrl = driver.getCurrentUrl();
		String replaceAll = currentUrl.replaceAll("[^0-9]","");
		System.out.println("Deletion Lead: " + replaceAll);
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Lead ID:')]/parent::div//input")).sendKeys(replaceAll);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		boolean displayed = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
		if(displayed == true)System.out.println("Lead Successfully Deleted");
				
		
		}
	
	

	@Test(invocationCount = 2,threadPoolSize = 2)
	public void priority1() {
		System.out.println("Priority1");
		
	}

		
				/*http://leaftaps.com/opentaps/control/main
				 
				Delete Lead:
				1	Launch the browser
				2	Enter the username
				3	Enter the password
				4	Click Login
				5	Click crm/sfa link
				6	Click Leads link
				7	Click Find leads
				8	Click on Phone
				9	Enter phone number
				10	Click find leads button
				11	Capture lead ID of First Resulting lead
				12	Click First Resulting lead
				13	Click Delete
				14	Click Find leads
				15	Enter captured lead ID
				16	Click find leads button
				17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
				18	Close the browser (Do not log out)
		*/
			}
		
		
		


