package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		String windowMain = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowsList = new ArrayList<String>(windowHandles);
		System.out.println("New window name: " + driver.switchTo().window(windowsList.get(1)).getTitle());
		driver.switchTo().window(windowMain);
		driver.findElement(By.xpath("//span[contains(text(),'Multiple')]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> windowsList2 = new ArrayList<String>(windowHandles2);
		System.out.println("Number of windows opened are: " + windowsList2.size());
		driver.switchTo().window(windowMain);
		driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
		Set<String> windowHandles3 = driver.getWindowHandles();
		List<String> windowsList3 = new ArrayList<String>(windowHandles3);
		int size = windowsList3.size();
		System.out.println(size);
		for(int i= 0; i<=size-1; i++)
		{
			
			if(!(windowsList3.get(i).equals(windowMain)))
			 driver.switchTo().window(windowsList3.get(i)).close();
			
			}

		driver.switchTo().window(windowMain);
		driver.findElement(By.xpath("//span[contains(text(),'delay')]")).click();
		Set<String> windowHandles4 = driver.getWindowHandles();
		List<String> windowsList4 = new ArrayList<String>(windowHandles4);
		int count = windowsList4.size();
		for(int i= 0; i<=count-1; i++)
		{
			
			driver.switchTo().window(windowsList4.get(i));
			System.out.println(driver.getTitle());
			
			}

		
		

	}

}
