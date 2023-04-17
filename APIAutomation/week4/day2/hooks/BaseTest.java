package week4.day2.hooks;

import io.cucumber.java.Before;
import io.restassured.RestAssured;

public class BaseTest {
	
	@Before
	public void setup() {
		RestAssured.baseURI = "https://dev146547.service-now.com/api/now/table/incident";
		RestAssured.authentication = RestAssured.basic("admin", "csG0Tr=1xUM^");
	}

}
