package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()= 'Try it']")).click();
		Alert alert = driver.switchTo().alert();
		String Enter = "Karthick";
		alert.sendKeys(Enter);
		alert.accept();
		String text = driver.findElement(By.xpath("//h2[text() = 'JavaScript Prompt']/following-sibling::p")).getText();
		if(text.contains(Enter))System.out.println("Successfully printed");
		else System.out.println("Not successfull");

	}

}
