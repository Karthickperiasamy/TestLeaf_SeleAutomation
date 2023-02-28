package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CreateOpportunityWithoutMandatoryFields {

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
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Opportunities')]/ancestor::a//*[name()='svg']")).click();
		Thread.sleep(3000);
		Actions builder = new Actions(driver);		
		WebElement newOpp = driver.findElement(By.xpath("//span[text()='New Opportunity']"));
		builder.click(newOpp).perform();
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//span[text()='27']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		System.out.println("Opportunity name error is: " + driver.findElement(By.xpath("(//label[contains(text(),'Opportunity Name')]/ancestor::lightning-input/div)[2]")).getText());
		System.out.println("Stage error is: " + driver.findElement(By.xpath("(//label[contains(text(),'Stage')]/ancestor::lightning-combobox/div)[2]")).getText());
		driver.close();
		
		
	}

}
