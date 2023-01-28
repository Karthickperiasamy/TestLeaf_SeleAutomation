package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3_Radio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//label[text()='Chrome']/preceding-sibling::div/div[contains(@class,'ui-radiobutton-box')]")).click();
		boolean enabled = driver.findElement(By.xpath("(//label[text()='Chennai']/preceding-sibling::div/div[contains(@class,'ui-radiobutton-box')]")).isSelected();
		if(enabled)System.out.println("Chennai is Unselectable");
		boolean enabled2 = driver.findElement(By.xpath("(//label[text()='Bengaluru']/preceding-sibling::div/div[contains(@class,'ui-radiobutton-box')]")).isSelected();
		if(enabled2)System.out.println("Bengaluru is Unselectable");
		boolean enabled3 = driver.findElement(By.xpath("(//label[text()='Hyderabad']/preceding-sibling::div/div[contains(@class,'ui-radiobutton-box')]")).isSelected();
		if(enabled2)System.out.println("Hyderabad is Unselectable");
		boolean enabled4 = driver.findElement(By.xpath("(//label[text()='Chrome']/preceding-sibling::div/div[contains(@class,'ui-radiobutton-box')])[2]")).isSelected();
		if(enabled4)System.out.println("Chrome is selected by default");
		boolean enabled5 = driver.findElement(By.xpath("//label[text()='Firefox']/preceding-sibling::div/div[contains(@class,'ui-radiobutton-box')]")).isSelected();
		if(enabled5)System.out.println("Firefox is selected by default");
		boolean enabled6 = driver.findElement(By.xpath("//label[text()='Safari']/preceding-sibling::div/div[contains(@class,'ui-radiobutton-box')]")).isSelected();
		if(enabled6)System.out.println("Safari is selected by default");
		boolean enabled7 = driver.findElement(By.xpath("//label[text()='Edge']/preceding-sibling::div/div[contains(@class,'ui-radiobutton-box')]")).isSelected();
		if(enabled7)System.out.println("Edge is selected by default");
		WebElement findElement = driver.findElement(By.xpath("(//label[text()='1-20 Years']/preceding-sibling::div/div[contains(@class,'ui-radiobutton-box')])[2]"));
		boolean selected = findElement.isSelected();
		Thread.sleep(3000);
		if(!selected)findElement.click();
		
		//driver.findElement(By.xpath("(//span[text()='Ajax']/preceding-sibling::div)[2]")).click();
		//Thread.sleep(3000);
		//System.out.println("isChecked: " + driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed());
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("(//span[text()='Ajax']/preceding-sibling::div)[2]")).click();
		//System.out.printl
	}

}

