package week3.day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncidentwithBodyAsString {
	
	
	@Test
	public void CreateInci() {
		
//		Step 1 - Requirements
		
		
		
//		Step 2 - Endpoint with resources
		
		RestAssured.baseURI = "https://dev146547.service-now.com/api/now/table/incident";
		
//		Step 3- construct the request (params, auth, etc)
		RestAssured.authentication = RestAssured.basic("admin", "csG0Tr=1xUM^");
		
		RequestSpecification inputRequest = RestAssured
									.given()
									.contentType(ContentType.JSON)
									.body("{\r\n"
											+ "  \"description\": \"My first test with Rest Assured\",\r\n"
											+ "  \"short_description\": \"Success\"\r\n"
											+ "}")
									;
				   					

		
//		Step 4 - send the request(http methods)
		Response response = inputRequest.post();
		
//		Step 5 - Validate the response
		response.prettyPrint();
	}

}
