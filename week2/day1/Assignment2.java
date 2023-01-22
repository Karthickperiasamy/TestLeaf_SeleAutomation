package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthick");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("KKUMAR");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Sales");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("karthickkumarrp@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Note");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Title is: "+ driver.getTitle());
		}

}

//## Multiple update buttons -- Need to clarify

/*Week2.Day1
//Assignment 2:Edit Lead
//1. Launch URL "http://leaftaps.com/opentaps/control/login"
//2. Enter UserName and Password Using Id Locator
//3. Click on Login Button using Class Locator
//4. Click on CRM/SFA Link
//5. Click on Leads Button
//6. Click on Create Lead 
//7. Enter CompanyName Field Using id Locator
//8. Enter FirstName Field Using id Locator
//9. Enter LastName Field Using id Locator
//10. Enter FirstName(Local) Field Using id Locator
//11. Enter Department Field Using any Locator of Your Choice
//12. Enter Description Field Using any Locator of your choice 
//13. Enter your email in the E-mail address Field using the locator of your choice
//14. Click on Create Button
//  15. Click on edit button
  16. Clear the Description Field using .clear()
17. Fill ImportantNote Field with Any text
18. Click on update button 
19. Get the Title of Resulting Page. refer the video  using driver.getTitle()*/