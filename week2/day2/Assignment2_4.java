package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Assignment2_4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Need clarification on below step:
		//11	Capture name of First Resulting lead
		//12	Click First Resulting lead


		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("karthick");
		//driver.findElement(By.xpath("//span[text()='Email']")).click();
		//driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("k@gmail.com");
		//driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		//driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("999");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		System.out.println(driver.getTitle());
		String text = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println("Current Lead Name is: " + text);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		//String text2 = driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).getText();
		//System.out.println("Current Lead Name is: " + text2);
		//driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Update");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//String text = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
		//String replaceAll = currentUrl.replaceAll("[^0-9]","");
		String text2 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println("Updated Lead Name is: " + text2);
		//if(text=="Duplicate Lead")System.out.println("This is Duplicated Lead");
		//driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		//String text3 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		if(text2.contains("Update"))System.out.println("Successfully Updated");
		driver.close();
	}

}
