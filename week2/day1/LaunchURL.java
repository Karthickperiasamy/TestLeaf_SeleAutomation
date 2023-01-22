package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURL {

	public static void main(String[] args) {
		// WebDriverManager.chromedriver().setup(); 
				 ChromeDriver driver=new ChromeDriver(); 
				 driver.get("http://leaftaps.com/opentaps/control/main");
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
				 driver.findElement(By.name("submitButton")).click();
				 
				 
				 }	// TODO Auto-generated method stub

	

}



//1. Launch leaptaps.com/opentaps
//2. Enter the username as DemoSalesManager
//3. Enter the password as crmsfa
//4. Click on Login
//5. Click on CRM/SFA link
//6. Click on Leads
//7. Click on Create Leads
//8. Fill Company Name, First Name, Last Name
//9. Click on Create Lead button