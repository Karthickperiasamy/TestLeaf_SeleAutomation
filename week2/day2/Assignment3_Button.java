package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.xpath("//h5[text() ='Click and Confirm title.']/following-sibling::button"));
		findElement.click();
		System.out.println(driver.getTitle());
		driver.get("https://www.leafground.com/button.xhtml");
		System.out.println("Is Button Enabled:" + driver.findElement(By.xpath("//h5[text() ='Confirm if the button is disabled.']/following-sibling::button")).isEnabled());
		System.out.println("(x axis, y axis) is: " + driver.findElement(By.xpath("//span[text()='Submit']")).getLocation());
		
	}

}








//https://www.leafground.com/button.xhtml
//1. Click and Confirm title
//2. Confirm if the button is disabled
//3. Find the position of the Submit button
