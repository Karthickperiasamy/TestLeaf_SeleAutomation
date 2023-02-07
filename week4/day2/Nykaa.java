package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement brands = driver.findElement(By.xpath("//a[text() = 'brands']"));
		WebElement brandSearch = driver.findElement(By.xpath("//input[@id='brandSearchBox' ]"));
		WebElement Loreal = driver.findElement(By.xpath("//a[text()=\"L'Oreal Paris\" ]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(brands)
		.pause(Duration.ofSeconds(1))
		.moveToElement(brandSearch)
		.click().sendKeys("L'Oreal Paris").pause(Duration.ofSeconds(1)).click(Loreal)
		.perform();
		Thread.sleep(0);
		System.out.println("Page Title is: " + driver.getTitle());
		driver.findElement(By.xpath("//span[text()='customer top rated']/parent::div/following-sibling::div")).click();
		
		
		
		

	}

}

/*
 * Assignment 2:Nykaa ============= 1) Go to https://www.nykaa.com/ 2) Mouseover
 * on Brands and Search L'Oreal Paris 3) Click L'Oreal Paris 4) Check the title
 * contains L'Oreal Paris(Hint-GetTitle) 5) Click sort By and select customer
 * top rated 6) Click Category and click Hair->Click haircare->Shampoo 7)
 * Click->Concern->Color Protection 8)check whether the Filter is applied with
 * Shampoo 9) Click on L'Oreal Paris Colour Protect Shampoo 10) GO to the new
 * window and select size as 175ml 11) Print the MRP of the product 12) Click on
 * ADD to BAG 13) Go to Shopping Bag 14) Print the Grand Total amount 15) Click
 * Proceed 16) Click on Continue as Guest 17) Check if this grand total is the
 * same in step 14 18) Close all windows
 */