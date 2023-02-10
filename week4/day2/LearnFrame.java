package week4.day2;

// Instead of 4 , frame count only showing 3. Please check4 - logic for innner frame
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node05us3gij8ed091h38fieurov685953.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement frameClick = driver.findElement(By.xpath("//h5[text() = ' Click Me (Inside frame)']/following-sibling::iframe"));
		driver.switchTo().frame(frameClick);
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		driver.switchTo().defaultContent();
		WebElement frameNest = driver.findElement(By.xpath("//h5[contains(text(),'Nested')]/following-sibling::iframe"));
		driver.switchTo().frame(frameNest);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		driver.switchTo().defaultContent();
		
		List<WebElement> outerFrame = driver.findElements(By.tagName("iframe"));
		int count = outerFrame.size();
        System.out.println("Total Number of Frames : "+count);
		int count1 = 0;
		count1 = count + outerFrame.size();
		System.out.println("outerframe"+count);
        for (int i = 0; i < outerFrame.size(); i++) {
		driver.switchTo().frame(i);
		List<WebElement> innerFrame = driver.findElements(By.tagName("iframe"));
		count1 = count +innerFrame.size();
		driver.switchTo().defaultContent();
        }
        
        System.out.println("Total frame count is: " + count1);

	}

}
