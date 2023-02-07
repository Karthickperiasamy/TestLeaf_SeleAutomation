package week4.day2;

//Wait for text change (1-10Sec) logic identifiable
//script not executing

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/waits.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.findElement(By.xpath("//h5[text()= 'Wait for Visibility (1 - 10 Sec)']/following-sibling::div//span[text()='Click']")).click();
		WebElement visible = driver.findElement(By.xpath("//span[text()= 'I am here']"));
		wait.until(ExpectedConditions.visibilityOf(visible));
		
		driver.findElement(By.xpath("//h5[text()= 'Wait for Invisibility (1 - 10 Sec)']/following-sibling::div//span[text()='Click']")).click();
		WebElement inVisible = driver.findElement(By.xpath("//span[text()= 'I am about to hide']"));
		wait.until(ExpectedConditions.invisibilityOf(inVisible));
		
		driver.findElement(By.xpath("//h5[text()= 'Wait for Clickability']/following-sibling::div//span[text()='Click First Button']")).click();
		WebElement clickable = driver.findElement(By.xpath("//span[text()= 'Click Second']"));
		wait.until(ExpectedConditions.elementToBeClickable(clickable));
		
		driver.findElement(By.xpath("//h5[text()= 'Wait for Text Change (1 - 10 Sec)']/following-sibling::div//span[text()='Click']")).click();
		WebElement change = driver.findElement(By.xpath("//span[text()= 'I am going to change!']"));
		wait.until(ExpectedConditions.attributeToBe(change, null, null));
		
		
		
		
		
		
				
		

	}

}
