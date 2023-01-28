package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

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
		System.out.println("Title is: "+ driver.getTitle());
		driver.findElement(By.partialLinkText("Duplicate")).click();
		WebElement findElement = driver.findElement(By.id("createLeadForm_companyName"));
		findElement.clear();
		findElement.sendKeys("NewTest");
		WebElement findElement2 = driver.findElement(By.id("createLeadForm_firstName"));
		findElement2.clear();
		findElement2.sendKeys("NewName");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("New Title is: "+ driver.getTitle());
	}

}


/*Assignment 3:Duplicate Lead
          1. Launch URL "http://leaftaps.com/opentaps/control/login"
		  2. Enter UserName and Password Using Id Locator
		  3. Click on Login Button using Class Locator
		  4. Click on CRM/SFA Link
		  5. Click on Leads Button
		  6. Click on Create Lead 
		  7. Enter CompanyName Field Using id Locator
		  8. Enter FirstName Field Using id Locator
		  9. Enter LastName Field Using id Locator
		  10. Enter FirstName(Local) Field Using id Locator
		  11. Enter Department Field Using any Locator of Your Choice
		  12. Enter Description Field Using any Locator of your choice 
		  13. Enter your email in the E-mail address Field using the locator of your choice
		  14. Click on Create Button
          15. Get the Title of Resulting Page(refer the video)  using driver.getTitle()
          16. Click on Duplicate button
          17. Clear the CompanyName Field using .clear() And Enter new CompanyName
          18.Clear the FirstName Field using .clear() And Enter new FirstName
          19.Click on Create Lead Button
          20. Get the Title of Resulting Page(refer the video)  using driver.getTitle()*/