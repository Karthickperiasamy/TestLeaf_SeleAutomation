package week4.day2;

//Need to check. Draggable rows not working

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		Actions builder = new Actions(driver);
		
		  WebElement dragElem =
		  driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		  builder.dragAndDropBy(dragElem, 50, 0).perform();
		  
		  WebElement dragSrc = driver.findElement(By.xpath("//span[text()='Name']"));
		  WebElement dragTar =
		  driver.findElement(By.xpath("//span[text()='Quantity']"));
		  builder.dragAndDrop(dragSrc, dragTar).perform();
		  
		  WebElement resize = driver.findElement(By.
		  xpath("//h4[text()='Resize Image']/following-sibling::div/div"));
		  builder.dragAndDropBy(resize, 20, 0).perform();
		  
		  WebElement drgSrc = driver.findElement(By.xpath("//p[text()= 'Drag to target']")); 
		  WebElement drgTar = driver.findElement(By.xpath("//span[text()= 'Droppable Target']"));
		  builder.dragAndDrop(drgSrc, drgTar).perform();
		 

		WebElement dragFRow = driver.findElement(By.xpath("//h5[text()= 'Draggable Rows']/following-sibling::div//tr[1]/td"));
		WebElement dragTRow = driver.findElement(By.xpath("//h5[text()= 'Draggable Rows']/following-sibling::div//tr[3]/td"));
		builder.dragAndDropBy(dragTRow, 0, 50).perform();
		
		  
		 driver.findElement(By.xpath("//span[text()= 'Start']")).click();
		  
		  WebElement slideLeft = driver.findElement(By.xpath("//h4[text()= 'Range Slider']/following-sibling::table//div/span"));
		  WebElement slideRight = driver.findElement(By.xpath("//h4[text()= 'Range Slider']/following-sibling::table//div/span[2]"));
		  builder.dragAndDropBy(slideLeft, -10, 0).perform();
		  builder.dragAndDropBy(slideRight,10, 0).perform();
		  
		 }

}
