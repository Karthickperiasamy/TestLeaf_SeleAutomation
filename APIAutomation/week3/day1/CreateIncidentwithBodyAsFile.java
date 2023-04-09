package week3.day1;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncidentwithBodyAsFile {
	
	
	@Test
	public void CreateInci() {
		
//		Step 1 - Requirements
		
		
		
//		Step 2 - Endpoint with resources
		
		RestAssured.baseURI = "https://dev146547.service-now.com/api/now/table/incident";
		
//		Step 3- construct the request (params, auth, etc)
		RestAssured.authentication = RestAssured.basic("admin", "csG0Tr=1xUM^");
		
		File file = new File("./src/test/resources/input.json");
		
		RequestSpecification inputRequest = RestAssured
									.given()
									.contentType(ContentType.JSON)
									.body(file)
									
									;
				   					

		
//		Step 4 - send the request(http methods)
		Response response = inputRequest.post();
		
//		Step 5 - Validate the response
		response.prettyPrint();
	}

}
