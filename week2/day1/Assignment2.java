package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		
		//input[@id='username']
		//Ex: //input[@type='password']
				
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		
		//input[@id='password']
		
		//driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		//input[@class='decorativeSubmit']
		
		//driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//a[contains(text(),'CRM/SFA')]
		
//		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//a[text()='Leads']
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		//a[text()='Create Lead']
		
		
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		//input[@id='createLeadForm_companyName']
		
		//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthick");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Karthick");
		//input[@id='createLeadForm_firstName']
		
		//driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Kumar");
		//input[@id='createLeadForm_lastName']
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("KKUMAR");
		//input[@id='createLeadForm_firstNameLocal']
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Sales");
		//input[@id='createLeadForm_departmentName']
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_description']")).sendKeys("Hi");
		//input[@id='createLeadForm_description']
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("karthickkumarrp@gmail.com");
		//input[@id='createLeadForm_primaryEmail']
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		//input[@type='submit']
		
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Note");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("Title is: "+ driver.getTitle());
		}

}


/*
Basic xPaths (5):
1. Attribute based xPath

//tagName[@attributeName='attributeValue']
//tagName[@attributeName1='attributeValue1'][@attributeName2='attributeValue2']
//tagName[@attributeName1='attributeValue1'][text()='textValue']

Ex: //input[@type='password']
//input[@type='password'][@id='password']
//input[@type='password' and @id='password']

2. Text based xPath:

//tagName[text()='textValue']

Ex: //label[text()='Password']
	//a[text()='CRM/SFA']

3. Partial Attribute based xPath:

//tagName[contains(@attributeName, 'partialAttributeValue')]

Ex: //input[contains(@id, 'pass')]

4. Partial Text based xPath:

//tagName[contains(text(),'partialTextValue')]

Ex: //label[contains(text(), 'Pass')]

5. Index based xPath:

(//tagName[@attributeName='attributeValue'])[index]

(//input[@class='inputLogin'])[2] */


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