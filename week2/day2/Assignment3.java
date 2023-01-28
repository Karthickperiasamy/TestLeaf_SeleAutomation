package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Type your name and choose the third option 
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h5[text() ='Type your name']/parent::form//input[@type='text']")).sendKeys("Baabu");
		driver.findElement(By.xpath("//h5[text() ='Append Country to this City.']/following-sibling::div//input")).sendKeys(" India");
		boolean enabled = driver.findElement(By.xpath("//h5[text() ='Verify if text box is disabled']/following-sibling::div//input")).isEnabled();
		if(enabled==false)System.out.println("TextBox is Disabled");
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		String attribute = driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getAttribute("value");
		System.out.println(attribute);
		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("kart@gmail.com	AboutMe");
		driver.findElement(By.xpath("//div[contains(@class,'ql-editor')]")).sendKeys("Editor");
		driver.findElement(By.xpath("//h5[text()='Just Press Enter and confirm error message*']/parent::form//input[@type='text']")).sendKeys(Keys.ENTER);
		System.out.println(driver.findElement(By.xpath("//span[@class='ui-message-error-detail']")).getText());
		WebElement findElement = driver.findElement(By.xpath("//h5[text()='Click and Confirm Label Position Changes']/following-sibling::span/label"));
		int x = findElement.getLocation().getX();
		int y = findElement.getLocation().getY();
		System.out.println("X =" +x);
		System.out.println("Y =" +y);
		driver.findElement(By.xpath("//h5[text()='Click and Confirm Label Position Changes']/following-sibling::span/input")).click();
		int x2 = findElement.getLocation().getX();
		int y2 = findElement.getLocation().getY();
		System.out.println("New X =" +x2);
		System.out.println("New Y =" +y2);
		if(x!=x2 || y!=y2)System.out.println("Label Position Changed");
		else System.out.println("Label Position not Changed");
		driver.findElement(By.xpath("//h5[text()='Type your name and choose the third option']/following-sibling::div//input")).sendKeys("KAR");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li[contains(@class,'ui-autocomplete-item')])[3]")).click();
		driver.findElement(By.xpath("//h5[text()='Click and Confirm Keyboard appears']/following-sibling::input")).click();
		boolean displayed = driver.findElement(By.xpath("//div[contains(@class,'keypad')]")).isDisplayed();
		System.out.println("Is Keypad Displayed" + displayed);
		driver.findElement(By.xpath("//h5[text()='Custom Toolbar']/following-sibling::div//div[contains(@class,'ql-editor')]")).sendKeys("Toolbar");
	}

}


/*Assignment:3
========================
LeafGround Assignments
*
**Note : Kindly refer the video attached to do the following assignments
TextBox
=======
https://www.leafground.com/input.xhtml
1. Type your name
2. Append Country to this City
3. Verify if text box is disabled
4. Clear the typed text
5. Retrieve the typed text
6. Type email and Tab. Confirm control moved to next element
7. Type about yourself
8. Text Editor
9. Just Press Enter and confirm error message*
10. Click and Confirm Label Position Changes
11. Type your name and choose the third option
12. Click and Confirm Keyboard appears
13. Custom Toolbar*/