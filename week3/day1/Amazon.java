package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
		List<WebElement> allPhonePrices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		List<Integer> allPrices = new ArrayList<Integer>();
				
				
				for(int i = 0; i< allPhonePrices.size(); i++)
				{ 
					String singlePhonePrice = allPhonePrices.get(i).getText().replaceAll(",","");
					if(!singlePhonePrice.equals("")) {
					System.out.println(singlePhonePrice);	
					int price = Integer.parseInt(singlePhonePrice);
					allPrices.add(price);
					}
				}
				
				Collections.sort(allPrices);
				System.out.println("Min. Price is: " + allPrices.get(0) );
	}

}
