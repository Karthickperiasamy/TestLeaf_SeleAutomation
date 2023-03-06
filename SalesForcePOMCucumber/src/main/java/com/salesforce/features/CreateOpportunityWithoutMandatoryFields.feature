Feature: Create Opportunity Without Mandatory Fields

#Background:
#Given Open the Browser
#And Launch the URL

@Sanity
Scenario Outline:
#Given Open the Browser
#And Launch the URL
#When Enter the username as <Username> and password as <password>
##When Enter the username as <Username>
#And Enter the password as <Password>
#And Click on Login
#Then Click on Toggle Menu
#Then Click on View All
When Click Sales
And Click Opportunities
Then Click New Opportunity
And Enter close date
And Click on save
Then Verify error for name and stage displayed 

Examples:
|Username|Password|Name|
|hari.radhakrishnan@qeagle.com|Leaf@123|Salesforce Automation by KARTHICK|
#|DemoCSR|crmsfa|


#	driver.findElement(By.xpath("//p[text()='Sales']")).click();
#		Thread.sleep(3000);
#		driver.findElement(By.xpath("//span[contains(text(),'Opportunities')]/ancestor::a//*[name()='svg']")).click();
#		Thread.sleep(3000);
#		Actions builder = new Actions(driver);		
#		WebElement newOpp = driver.findElement(By.xpath("//span[text()='New Opportunity']"));
#		builder.click(newOpp).perform();
#		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
#		driver.findElement(By.xpath("//span[text()='27']")).click();
#		driver.findElement(By.xpath("//button[text()='Save']")).click();
#		System.out.println("Opportunity name error is: " + driver.findElement(By.xpath("(//label[contains(text(),'Opportunity Name')]/ancestor::lightning-input/div)[2]")).getText());
#		System.out.println("Stage error is: " + driver.findElement(By.xpath("(//label[contains(text(),'Stage')]/ancestor::lightning-combobox/div)[2]")).getText());
#		driver.close();
