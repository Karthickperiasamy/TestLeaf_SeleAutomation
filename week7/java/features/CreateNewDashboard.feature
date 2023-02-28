Feature: Create Dashboard

@Functional
Scenario:
When Click Dashboards
Then Click New Dashboard
And Enter dashboard name
And Click Create
Then Save
And Verify Dashboard created



#
#		Actions builder = new Actions(driver);		
#		WebElement dashEle = driver.findElement(By.xpath("//p[text()='Dashboards']"));
#		builder.click(dashEle).pause(Duration.ofSeconds(5)).perform();
#		driver.findElement(By.xpath("//div[text()='New Dashboard']")).click();
#		WebElement iFrame = driver.findElement(By.xpath("//iframe"));
#		driver.switchTo().frame(iFrame);
#		String dashName = "Salesforce Automation by KARTHICK";
#		driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys(dashName);
#        driver.findElement(By.xpath("//button[text()='Create']")).click();
#        driver.switchTo().defaultContent();
#//        WebElement frameEle = driver.findElement(By.xpath("(//iframe)"));
#        driver.switchTo().frame(0);
#        Thread.sleep(3000);
#        
#        driver.findElement(By.xpath("//div[@class='slds-button-group']//button")).click();        
#        System.out.println(driver.findElement(By.xpath("//div[contains(@id,'toastDescription')]/span")).getText());      
#        String FinalDashName = driver.findElement(By.xpath("//label[text()= 'Edit Dashboard name']/following-sibling::div//span")).getText();
#        if(dashName.equals(FinalDashName))System.out.println("Dashboard Successfully Created");
#        else System.out.println("Unsuccessful");
