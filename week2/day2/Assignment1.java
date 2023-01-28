package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(90));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("KFIRS");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("KLAST");
		driver.findElement(By.xpath("//div[contains(text(),'Mobile')]/following-sibling::input")).sendKeys("9999999999");
		driver.findElement(By.xpath("//div[contains(text(),'New password')]/following-sibling::input")).sendKeys("passpass");
		WebElement findElement = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select select = new Select(findElement);
		select.selectByVisibleText("19");
		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		 Select select2 = new Select(findElement2);
		 select2.selectByVisibleText("Oct");
		 WebElement findElement3 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		 Select select3 = new Select(findElement3);
		 select3.selectByVisibleText("1988");
		 driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input")).click();
			
		
	}

}
/*Assignment:1
FaceBook:
================================
// Step 1: Download and set the path 
// Step 2: Launch the chromebrowser
// Step 3: Load the URL https://en-gb.facebook.com/
// Step 4: Maximise the window
// Step 5: Add implicit wait
// Step 6: Click on Create New Account button
// Step 7: Enter the first name
// Step 8: Enter the last name
// Step 9: Enter the mobile number
// Step 10: Enterthe password
// Step 11: Handle all the three drop downs
// Step 12: Select the radio button "Female" 
            ( A normal click will do for this step) */