Feature: Create Individual

#Background:
#Given Open the Browser
#And Launch the URL

@Smoke
Scenario Outline:
#Given Open the Browser
#And Launch the URL
#When Enter the username as <Username> and password as <password>
#When Enter the username as <Username>
#And Enter the password as <Password>
#And Click on Login
#Then Click on Toggle Menu
#Then Click on View All
Then Click on Individuals
And Click on New
Then Enter the Last Name as <LName>
And Click on Save
Then Individual should be saved successfully  

Examples:
|Username|Password|LName|
|hari.radhakrishnan@qeagle.com|Leaf@123|Kumar|
#|DemoCSR|crmsfa|

#		driver.get("https://login.salesforce.com");
#		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
#		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@123");
#		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
#		driver.findElement(By.xpath("//input[@id='Login']")).click();
#		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
#		driver.findElement(By.xpath("//button[contains(text(),\"View All\")]")).click();
#		Actions builder = new Actions(driver);		
#		WebElement dashEle = driver.findElement(By.xpath("//p[text()='Individuals']"));
#		builder.click(dashEle).pause(Duration.ofSeconds(5)).perform();
#		driver.findElement(By.xpath("//div[text()= 'New']")).click();
#		driver.findElement(By.xpath("//span[text()='Last Name']/parent::label/following-sibling::input")).sendKeys("Kumar");
#		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
#		System.out.println(driver.findElement(By.xpath("//span[@data-aura-class=\"forceActionsText\"]")).getText());
#		
#		
#				//driver.close();
#	}
#
#}
#
#
#	/*
#	 *  Test Steps: 
#	 *  1. Login to https://login.salesforce.com 
#	 *  2.Click on the toggle menu button from the left corner 
#	 *  3. Click View All and click Individuals from App Launcher
#	 *  4. Click on New Individual 
#	 *  5. Enter the Last Name as 'Kumar'
#	 *  6.Click save and verify Individuals Name"
#	 * 
#	 * 
#	 * Refer Step Video:
#	 * https://drive.google.com/file/d/1qn3L4lSCM59vJRD0-8bBCjVHfLIaU-lU/view?usp=
#	 * sharing"
#	 */
#
