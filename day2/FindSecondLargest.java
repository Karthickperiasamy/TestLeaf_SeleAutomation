package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> findLargest = new TreeSet<Integer>();
		for (int i=0; i<data.length;i++)
		{
			findLargest.add(data[i]);
			
		}

		System.out.println(findLargest);
		
		List<Integer> list = new ArrayList(findLargest);
		System.out.println(list);
		System.out.println(list.get(list.size()-2));
	}

}


//Here is the input
		//int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		//       output= 7;

		/*
		 * Pseudo Code: 
		 * a) Create a empty Set Using TreeSet
		 * b) Declare for loop iterator from 0 to data.length and add into Set 
		 * c) converted Set into List
		 * d) Print the second last element from List
		 * 
		 * 
		 */



/* Week3.Day2
Assignment:1  :Collections-using List and Set

1.https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week3/day1/Assignments/FindSecondLargest.java
2.https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week3/day1/Assignments/MissingNumber.java
3.https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week3/day1/Assignments/RemoveDuplicatesWords.java
4.https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week3/day1/Assignments/PrintUniqueCharacter.java
5.https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week3/day1/Classroom/SortingUsingCollection.java
6.https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week3/day1/Classroom/RemoveDuplicates.java

MAP
1.https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week3/day1/Assignments/FindNumberOfOccurances.java

2.https://github.com/TestLeafPages/SeleniumAssignments/blob/master/week3/day1/Assignments/FindMostDuplicateNumber.java
	
SAMPLE PROGRAM TO IMPLEMENT List
=================================
 NOTE: Java code is attached for your reference.

1. Launch the URL https://www.ajio.com/
2. In the search box, type as "bags" and press enter
3. To the left  of the screen under " Gender" click the "Men"
4. Under "Category" click "Fashion Bags"
5. Print the count of the items Found. 
6. Get the list of brand of the products displayed in the page and print the list.
7. Get the list of names of the bags and print it

SAMPLE PROGRAM TO IMPLEMENT List : code
=================================
package Assignments;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		// Step 2: Instantaite the ChromeDriver
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		// Loads a new web page in the current browser window
		// Maximise the screen
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		//In the search box, type as "bags" and press enter

		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		//driver.findElement(By.id("Men")).click();
		Thread.sleep(2000);
		// To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		//Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		// Print the count of the items Found.
		String totalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of items : " + totalItems);
		//Get the list of brand of the products displayed in the page and print the list.
		System.out.println(" List of Brands");
		List<WebElement> bagBrandList = driver.findElements(By.className("brand"));
		System.out.println(" Size :" + bagBrandList.size());

		for (WebElement webElement : bagBrandList) {
			String text = webElement.getText();
			System.out.println(text);
		}
		// Get the list of names of the bags and print it
		List<WebElement> bagNameList = driver.findElements(By.className("nameCls"));
		System.out.println(" Size :" + bagNameList.size());
		System.out.println(" Names of the Bags");
		for (WebElement webElement : bagNameList) {
			String text = webElement.getText();
			System.out.println(text);
		}

	}
}*/