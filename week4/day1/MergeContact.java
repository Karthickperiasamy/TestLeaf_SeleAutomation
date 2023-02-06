package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()= 'Contacts']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Merge')]")).click();
		driver.findElement(By.xpath("//img[@src= '/images/fieldlookup.gif']")).click();
		String currentHandle = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowsList.get(1));
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		driver.switchTo().window(currentHandle);
		driver.findElement(By.xpath("(//img[@src= '/images/fieldlookup.gif'])[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> windowsList2 = new ArrayList<String>(windowHandles2);
		driver.switchTo().window(windowsList2.get(1));
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		driver.switchTo().window(currentHandle);
		driver.findElement(By.xpath("//a[text()= 'Merge']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(driver.getTitle());
		
				
	}

}
/*
		 * 13. Verify the title of the page
		 */
	

