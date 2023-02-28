package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CreateAccounts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[contains(text(),\"View All\")]")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Accounts']/parent::a/following-sibling::one-app-nav-bar-item-dropdown//*[name()='svg']")).click();
		Thread.sleep(3000);
		WebElement newAcc = driver.findElement(By.xpath("//span[text()='New Account']"));
		Actions builder = new Actions(driver);
		builder.click(newAcc).pause(Duration.ofSeconds(5)).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Karthick");
		Thread.sleep(3000);
		builder.scrollByAmount(0, 300);
		WebElement dropDown = driver.findElement(By.xpath("(//span[text()='--None--'])[4]"));
		driver.executeScript("arguments[0].click()", dropDown);
		//builder.click(dropDown).pause(Duration.ofSeconds(5)).perform();
		WebElement value = driver.findElement(By.xpath("(//span[text()='Public']"));
		builder.click(value).pause(Duration.ofSeconds(5)).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//span[text()='Account']/a")).getText());
		
//		Actions builder = new Actions(driver);		
//		WebElement dashEle = driver.findElement(By.xpath("//p[text()='Individuals']"));
//		builder.click(dashEle).pause(Duration.ofSeconds(5)).perform();
//		driver.findElement(By.xpath("//div[text()= 'New']")).click();
//		driver.findElement(By.xpath("//span[text()='Last Name']/parent::label/following-sibling::input")).sendKeys("Kumar");
//		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
//		System.out.println(driver.findElement(By.xpath("//span[@data-aura-class=\"forceActionsText\"]")).getText());
		
		
				//driver.close();
	}

}

/*
 *  Test Steps:
 *  1. Login to https://login.salesforce.com 
 *  2.Click on toggle menu button from the left corner
 *  3. Click view All and click Sales from App Launcher
 *  4. Click on Accounts tab 
 *  5. Click on New button 
 *  6.Enter 'your name' as account name 
 *  7. Select Ownership as Public
 *  8. Click save and verify Account name "
 * 
 * 
 * Refer Step Video:
 * https://drive.google.com/file/d/1XuOUyaqiqbNOlLelFAeRfR7VSZOpZk23/view?usp=
 * sharing"
 * 
 */
