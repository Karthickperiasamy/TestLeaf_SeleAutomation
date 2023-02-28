package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CreateIndividual {

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
		Actions builder = new Actions(driver);		
		WebElement dashEle = driver.findElement(By.xpath("//p[text()='Individuals']"));
		builder.click(dashEle).pause(Duration.ofSeconds(5)).perform();
		driver.findElement(By.xpath("//div[text()= 'New']")).click();
		driver.findElement(By.xpath("//span[text()='Last Name']/parent::label/following-sibling::input")).sendKeys("Kumar");
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		System.out.println(driver.findElement(By.xpath("//span[@data-aura-class=\"forceActionsText\"]")).getText());
		
		
				//driver.close();
	}

}


	/*
	 *  Test Steps: 
	 *  1. Login to https://login.salesforce.com 
	 *  2.Click on the toggle menu button from the left corner 
	 *  3. Click View All and click Individuals from App Launcher
	 *  4. Click on New Individual 
	 *  5. Enter the Last Name as 'Kumar'
	 *  6.Click save and verify Individuals Name"
	 * 
	 * 
	 * Refer Step Video:
	 * https://drive.google.com/file/d/1qn3L4lSCM59vJRD0-8bBCjVHfLIaU-lU/view?usp=
	 * sharing"
	 */

