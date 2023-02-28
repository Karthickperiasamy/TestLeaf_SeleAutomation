package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;


public class BaseClass extends AbstractTestNGCucumberTests{
	public static ChromeDriver driver;
	public static ChromeOptions options;
	
	@BeforeMethod
	public void preCondition() {
		options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Leaf@123");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[contains(text(),\"View All\")]")).click();
		
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}

	
//	@BeforeMethod
//	public void preCondition() {
//		driver = new ChromeDriver();
//		driver.get("http://leaftaps.com/opentaps/");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	}
//	
//	@AfterMethod
//	public void postCondition() {
//		driver.close();
//	}

}
