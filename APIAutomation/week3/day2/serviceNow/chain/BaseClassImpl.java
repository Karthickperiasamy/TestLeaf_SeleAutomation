package week3.day2.serviceNow.chain;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClassImpl {
	
	static RequestSpecification request=null;
	 static String sys_id=null;
	 static Response response=null;
	
	@BeforeMethod
	public void setup() {
		
		RestAssured.baseURI = "https://dev146547.service-now.com/api/now/table/";
		RestAssured.authentication = RestAssured.basic("admin", "csG0Tr=1xUM^");
		
		request = RestAssured.given().contentType(ContentType.JSON).log().all();

	}
	
	@AfterMethod
	public void tearDown() {
		response.then().log().all();
	}

}
