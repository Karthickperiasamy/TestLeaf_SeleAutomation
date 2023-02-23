package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DuplicateLead extends BaseClass{

	@Test
	public void duplicateLead() throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Duplicate Lead - Need inputs
		
		//11	Capture name of First Resulting lead
		//12	Click First Resulting lead

		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("k@gmail.com");
		//driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		//driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("999");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String text2 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println("Current Lead Name is: " + text2);
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String text = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
		//String replaceAll = currentUrl.replaceAll("[^0-9]","");
		System.out.println("New Lead Title is: " + text);
		if(text=="Duplicate Lead")System.out.println("This is Duplicated Lead");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		String text3 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		String replaceAll = text2.replaceAll("[0-9]","");
		String replaceAll2 = text3.replaceAll("[0-9]","");
		System.out.println(replaceAll);
		System.out.println(replaceAll2);
		if(replaceAll.contains(replaceAll2))System.out.println("Successfully Duplicated");
		//driver.findElement(By.xpath("//a[text()='Delete']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		//driver.findElement(By.xpath("//label[contains(text(),'Lead ID:')]/parent::div//input")).sendKeys(replaceAll);
		//driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//boolean displayed = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();
		//if(displayed == true)System.out.println("Lead Successfully Deleted");
		//driver.close();
		}

}

/*http://leaftaps.com/opentaps/control/main

1	Launch the browser
2	Enter the username
3	Enter the password
4	Click Login
5	Click crm/sfa link
6	Click Leads link
7	Click Find leads
8	Click on Email
9	Enter Email
10	Click find leads button
11	Capture name of First Resulting lead
12	Click First Resulting lead
13	Click Duplicate Lead
14	Verify the title as 'Duplicate Lead'
15	Click Create Lead
16	Confirm the duplicated lead name is same as captured name
17	Close the browser (Do not log out)*/