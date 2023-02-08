package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
//why both thread.sleep & implicit wait?
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement menFashion = driver.findElement(By.xpath("//span[text()= \"Men's Fashion\"]"));
		WebElement sportShoes = driver.findElement(By.xpath("//span[text()= \"Sports Shoes\"]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(menFashion)
		.click(sportShoes).perform();
		
		System.out.println("Total sport shoe count is : "  + driver.findElement(By.xpath("//h1/following-sibling::span")).getText());
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(), 'Popularity')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(), 'Popularity')]/parent::div/following-sibling::ul/li[2]")).click();
		List<WebElement> element = driver.findElements(By.xpath("//span[@class=\"lfloat product-price\"]"));
		List<String> prices = new ArrayList<String>();
		for (int i=0; i< element.size(); i++) {
			prices.add(element.get(i).getText());			
		}
		System.out.println(prices);
		
		driver.findElement(By.xpath("//span[text()= 'Rs.']/preceding-sibling::input")).sendKeys("900");
		driver.findElement(By.xpath("(//span[text()= 'Rs.']/preceding-sibling::input)[2]")).sendKeys("1200");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(), 'GO')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='Color_s-Navy']")).click();
		System.out.println(driver.findElement(By.xpath("(//div[@class='filters-top-selected']//div[@class='navFiltersPill'])[1]")).getText());
		System.out.println(driver.findElement(By.xpath("(//div[@class='filters-top-selected']//div[@class='navFiltersPill'])[2]")).getText());
		WebElement firstRes = driver.findElement(By.xpath("//picture/img[@title]"));
		WebElement quickView = driver.findElement(By.xpath("//div[contains(text(),'Quick')]"));
		builder.moveToElement(firstRes).pause(Duration.ofSeconds(1))
		.click(quickView).perform();
		System.out.println( "Price is: " + driver.findElement(By.xpath("//span[@class = 'payBlkBig']")).getText());
		System.out.println( "Discount is: " + driver.findElement(By.xpath("//span[@class = 'percent-desc ']")).getText());
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("./screen.png"));		
		
	}

}

/*
 * Assignment 3:SnapDeal ============ 1. Launch https://www.snapdeal.com/ 2. Go
 * to Mens Fashion 3. Go to Sports Shoes 4. Get the count of the sports shoes 5.
 * Click Training shoes 6. Sort by Low to High 7. Check if the items displayed
 * are sorted correctly 8.Select the price range (900-1200) 9.Filter with color
 * Navy 10 verify the all applied filters 11. Mouse Hover on first resulting
 * Training shoes 12. click QuickView button 13. Print the cost and the discount
 * percentage 14. Take the snapshot of the shoes. 15. Close the current window
 * 16. Close the main window
 */