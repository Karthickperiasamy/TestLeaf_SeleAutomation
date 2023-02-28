//package steps;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.But;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class Login extends BaseClass{
//	
//	@Given("Open the Browser")
//	public void openBrowser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//	}
//	
//	@And("Launch the URL")
//	public void launchURL() {
//		driver.get("http://leaftaps.com/opentaps");
//	}
//	
////	@When("Enter the username as {string} and password as {string}")
////	public void enterUsernameAndPwd(String uName, String pwd) {
////		driver.findElement(By.id("username")).sendKeys(uName);
////	}
//	
//	@When("Enter the username as (.*)$")
//	public void enterUsername(String uName) {
//		driver.findElement(By.id("username")).sendKeys(uName);
//	}
//	
//	@When("Enter the password as (.*)$")
//	public void enterPassword(String pwd) {
//		driver.findElement(By.id("password")).sendKeys(pwd);
//	}
//	
//	@And("Click on Login")
//	public void clickLogin() {
//		driver.findElement(By.className("decorativeSubmit")).click();
//	}
//	
//	@Then("Homepage should be displayed")
//	public void verifyHomepage() {
//		if (driver.getTitle().equalsIgnoreCase("Leaftaps - TestLeaf Automation Platform")){
//			System.out.println("Login is successful");
//		} else {
//			System.out.println("Login is unsuccessful");
//		}
//	}
//	
//	@But("Error message should be displayed")
//	public void verifyErrorMessage() {
//		if(driver.findElement(By.id("errorDiv")).getText().contains("Password incorrect")) {
//			System.out.println("Login failed");
//		} else {
//			System.out.println("Login is success");
//		}
//	}
//
//	
//	
//}
