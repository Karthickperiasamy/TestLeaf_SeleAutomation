Feature: Create Account

@Regression
Scenario:
When Click Accounts
Then Click New Account
And Enter username
And Select dropdown
Then Choose Save
And Verify Account Name


#driver.findElement(By.xpath("//p[text()='Sales']")).click();
#		Thread.sleep(4000);
#		driver.findElement(By.xpath("//span[text()='Accounts']/parent::a/following-sibling::one-app-nav-bar-item-dropdown//*[name()='svg']")).click();
#		Thread.sleep(3000);
#		WebElement newAcc = driver.findElement(By.xpath("//span[text()='New Account']"));
#		Actions builder = new Actions(driver);
#		builder.click(newAcc).pause(Duration.ofSeconds(5)).perform();
#		Thread.sleep(3000);
#		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Karthick");
#		Thread.sleep(3000);
#		builder.scrollByAmount(0, 300);
#		WebElement dropDown = driver.findElement(By.xpath("(//span[text()='--None--'])[4]"));
#		driver.executeScript("arguments[0].click()", dropDown);
#		//builder.click(dropDown).pause(Duration.ofSeconds(5)).perform();
#		WebElement value = driver.findElement(By.xpath("(//span[text()='Public']"));
#		builder.click(value).pause(Duration.ofSeconds(5)).perform();
#		Thread.sleep(3000);
#		driver.findElement(By.xpath("//button[text()='Save']")).click();
#		Thread.sleep(3000);
#		System.out.println(driver.findElement(By.xpath("//span[text()='Account']/a")).getText());