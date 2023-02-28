package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CreateNewOpportunity {

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
		String actualName = "Salesforce Automation by KARTHICK";
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(actualName);
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//span[text()='26']")).click();
		driver.findElement(By.xpath("//button[@id=\"combobox-button-246\"]")).click();
		driver.findElement(By.xpath("//span[text()='Needs Analysis']")).click();
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		Thread.sleep(3000);
		String createdName = driver.findElement(By.xpath("//span[text()='Opportunity']/a/div")).getText();
		System.out.println("Opportunity name is" + createdName);		
		if(actualName.equals(createdName))System.out.println("Successful Opportunity creation");
		else System.out.println("Unsuccessful");
		driver.close();
	}

}
