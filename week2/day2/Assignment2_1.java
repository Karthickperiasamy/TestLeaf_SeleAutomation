package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.xpath("//a[text()='Contacts']")).click();
				driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
				driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("FFirst");
				driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("LName");
				driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("LocName");
				driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("LocLast");
				driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("DName");
				driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Desc");
				driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("karth@gmai.com");
				WebElement findElement = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
				Select select = new Select(findElement);
				select.selectByVisibleText("New York");
				driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
				driver.findElement(By.xpath("//a[text()='Edit']")).click();
				driver.findElement(By.xpath("//textarea[@id='updateContactForm_description']")).clear();
				driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("Imp");
				driver.findElement(By.xpath("//input[@value='Update']")).click();
				System.out.println("Title is:" + driver.getTitle());
				//driver.findElement(By.linkText("Leads")).click();
				//driver.findElement(By.linkText("Create Lead")).click();
				//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthick");
				//driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
				//driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("KKUMAR");
				//driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Sales");
				//driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi");
				//driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("karthickkumarrp@gmail.com");
				//driver.findElement(By.name("submitButton")).click();
				//System.out.println("Title is: "+ driver.getTitle());
				//driver.findElement(By.partialLinkText("Duplicate")).click();
				//WebElement findElement = driver.findElement(By.id("createLeadForm_companyName"));
				//findElement.clear();
				//findElement.sendKeys("NewTest");
				//WebElement findElement2 = driver.findElement(By.id("createLeadForm_firstName"));
				//findElement2.clear();
				//findElement2.sendKeys("NewName");
				//driver.findElement(By.name("submitButton")).click();
				//System.out.println("New Title is: "+ driver.getTitle());
			}

		}





/*
 * //Pseudo Code
 * 
 * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
 * 
 * 2. Enter UserName and Password Using Id Locator
 * 
 * 3. Click on Login Button using Class Locator
 * 
 * 4. Click on CRM/SFA Link
 * 
 * 5. Click on contacts Button
 * 
 * 6. Click on Create Contact
 *  
 * 7. Enter FirstName Field Using id Locator
 * 
 * 8. Enter LastName Field Using id Locator
 * 
 * 9. Enter FirstName(Local) Field Using id Locator
 * 
 * 10. Enter LastName(Local) Field Using id Locator
 * 
 * 11. Enter Department Field Using any Locator of Your Choice
 * 
 * 12. Enter Description Field Using any Locator of your choice 
 * 
 * 13. Enter your email in the E-mail address Field using the locator of your choice
 * 
 * 14. Select State/Province as NewYork Using Visible Text
 * 
 * 15. Click on Create Contact
 * 
 * 16. Click on edit button 
 * 
 * 17. Clear the Description Field using .clear
 * 
 * 18. Fill ImportantNote Field with Any text
 * 
 * 19. Click on update button using Xpath locator
 * 
 * 20. Get the Title of Resulting Page.
 */