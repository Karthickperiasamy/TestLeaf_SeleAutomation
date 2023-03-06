Feature: Create Opportunity

#Background:
#Given Open the Browser
#And Launch the URL

@Sanity
Scenario Outline:
#Given Open the Browser
#And Launch the URL
#When Enter the username as <Username> and password as <password>
When Enter the username as <Username>
And Enter the password as <Password>
And Click on Login
#Then Click on Toggle Menu
##Then Click on View All7
#Then Click on Sales
#And Click on Opportunities
#And Click on New Opportunity
#And Enter the Name as <Name>
#And Enter the CloseDate
#Then Select the action
#And Click Save
#Then Verify Opportunity successfully created

Examples:
|Username|Password|Name|
|hari.radhakrishnan@qeagle.com|Leaf@123|Salesforce Automation by KARTHICK|
#|DemoCSR|crmsfa|

#driver.findElement(By.xpath("//p[text()='Sales']")).click();
#		Thread.sleep(3000);
#		driver.findElement(By.xpath("//span[contains(text(),'Opportunities')]/ancestor::a//*[name()='svg']")).click();
#		Thread.sleep(3000);
#		Actions builder = new Actions(driver);		
#		WebElement newOpp = driver.findElement(By.xpath("//span[text()='New Opportunity']"));
#		builder.click(newOpp).perform();
#		String actualName = "Salesforce Automation by KARTHICK";
#		Thread.sleep(3000);
#		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(actualName);
#		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
#		driver.findElement(By.xpath("//span[text()='26']")).click();
#		driver.findElement(By.xpath("//button[@id=\"combobox-button-246\"]")).click();
#		driver.findElement(By.xpath("//span[text()='Needs Analysis']")).click();
#		driver.findElement(By.xpath("//button[text()='Save']")).click();
#		Thread.sleep(3000);
#		String createdName = driver.findElement(By.xpath("//span[text()='Opportunity']/a/div")).getText();
#		System.out.println("Opportunity name is" + createdName);		
#		if(actualName.equals(createdName))System.out.println("Successful Opportunity creation");
#		else System.out.println("Unsuccessful");
