package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		WebElement findElement = driver.findElement(By.xpath("//h5[text()='Which is your favorite UI Automation tool?']/following-sibling::div//select"));
		Select dd = new Select(findElement);
		dd.selectByIndex(1);
		
		driver.findElement(By.xpath("//label[text()='Select Country']")).click();
		driver.findElement(By.xpath("(//li[text()='Select Country']/following-sibling::li)[3]")).click();
		//Select dd2 = new Select(findElement2);
		//dd2.selectByIndex(3);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		driver.findElement(By.xpath("(//li[text()='Select City']/following-sibling::li)[2]")).click();
		
		//WebElement findElement3 = driver.findElement(By.xpath("//h5[text()='Confirm Cities belongs to Country is loaded']/following-sibling::div//select"));
		//Select dd3 = new Select(findElement3);
		//List<WebElement> options = dd3.getOptions();
		//if(options.isEmpty()) System.out.println("Dropdown is empty");
		//else System.out.println("Dropdown is loaded");
		
				
		driver.findElement(By.xpath("//h5[text()='Choose the Course']/following-sibling::div//button")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[contains(@class,'ui-autocomplete-item')][3]")).click();
		
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		driver.findElement(By.xpath("(//li[text()='Select Language']/following-sibling::li)[2]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		driver.findElement(By.xpath("(//li[text()='Select Values']/following-sibling::li)[1]")).click();
		
		
		//h5[text()='Choose the Course']/following-sibling::div//button
		
		//DropDown https://www.leafground.com/select.xhtml

		//Checkbox https://www.leafground.com/checkbox.xhtml

		//Radio https://www.leafground.com/radio.xhtml

	}

}
