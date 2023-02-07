package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWindow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);	
		String text = driver.findElement(By.className("a-price-whole")).getText();
		System.out.println("Number of ratings" + driver.findElement(By.xpath("//span[contains(@class,'s-underline-text')]")).getText());
		driver.findElement(By.xpath("//a[contains(@class,'s-underline-link-text' )]/span")).click();
		String windowHandle = driver.getWindowHandle();
		Set<String> allHandles = driver.getWindowHandles();
		List<String> handlesList = new ArrayList<String> (allHandles);
		driver.switchTo().window(handlesList.get(1));		
		File screenshot = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,new File("./screen.png"));
		driver.findElement(By.id("add-to-cart-button")).click();
		String text2 = driver.findElement(By.xpath("//span[contains(@class ,'sw-subtotal-amount')]//span[@class = 'a-price-whole']")).getText();
		if(text.equals(text2))System.out.println("Sub total is correct");
		driver.close();

	}

}

/*
 * Assignment 2 Amazon 1.Load the URL https://www.amazon.in/ 2.search as oneplus
 * 9 pro 3.Get the price of the first product 4. Print the number of customer
 * ratings for the first displayed product 5. Click the first text link of the
 * first image 6. Take a screen shot of the product displayed 7. Click 'Add to
 * Cart' button 8. Get the cart subtotal and verify if it is correct. 9.close
 * the browser
 */