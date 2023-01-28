package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//unchecked notification validation not working
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[text()='Basic']/preceding-sibling::div)[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Ajax']/preceding-sibling::div)[2]")).click();
		Thread.sleep(3000);
		System.out.println("isChecked: " + driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed());
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[text()='Ajax']/preceding-sibling::div)[2]")).click();
		//System.out.println("isUnChecked: " + driver.findElement(By.xpath("//span[text()='UnChecked']")).isDisplayed());
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//label[text()='Java']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Python']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//label[text()='Others']/preceding-sibling::div")).click();
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following-sibling::div//div[contains(@class,'ui-chkbox-box')]")).click();
		Thread.sleep(3000);
		System.out.println("Is State1:" + driver.findElement(By.xpath("//span[text()='State has been changed.']/following-sibling::p[text() ='State = 1']")).isDisplayed());
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following-sibling::div//div[contains(@class,'ui-chkbox-box')]")).click();
		Thread.sleep(3000);
		System.out.println("Is State2:" + driver.findElement(By.xpath("//span[text()='State has been changed.']/following-sibling::p[text() ='State = 2']")).isDisplayed());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h5[text()='Tri State Checkbox']/following-sibling::div//div[contains(@class,'ui-chkbox-box')]")).click();
		Thread.sleep(3000);
		System.out.println("Is State0:" + driver.findElement(By.xpath("//span[text()='State has been changed.']/following-sibling::p[text() ='State = 0']")).isDisplayed());
		driver.findElement(By.xpath("//h5[text()='Toggle Switch']/following-sibling::div//div[contains(@class,'ui-toggleswitch-slider')]")).click();
		Thread.sleep(3000);
		System.out.println("isChecked: " + driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed());
		driver.findElement(By.xpath("//h5[text()='Toggle Switch']/following-sibling::div//div[contains(@class,'ui-toggleswitch-slider')]")).click();
		Thread.sleep(3000);
		System.out.println("isUnchecked: " + driver.findElement(By.xpath("//span[text()='Unchecked']")).isDisplayed());
		System.out.println("IsEnabled:" + driver.findElement(By.xpath("//h5[text()='Verify if check box is disabled']/following-sibling::div//div[contains(@class,'ui-selectbooleancheckbox')]")).isEnabled());
		driver.findElement(By.xpath("//h5[text()='Select Multiple']/following-sibling::div//div[contains(@class,'selectcheckboxmenu')]")).click();
		driver.findElement(By.xpath("(//label[text()='Miami']/ancestor::body//div[contains(@id,'multiple_panel')]//div[contains(@class,'ui-corner-all')])[2]")).click();
		
		
/*		Select dd = new Select(findElement);
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
*/		

	}

}

