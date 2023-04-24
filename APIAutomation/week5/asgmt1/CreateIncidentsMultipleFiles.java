package week5.asgmt1;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncidentsMultipleFiles {
	
	
	@Test
	public void CreateInci() {
		
//		Step 1 - Requirements
		
		
		
//		Step 2 - Endpoint with resources
		
		RestAssured.baseURI = "https://dev146547.service-now.com/api/now/table/incident";
		
//		Step 3- construct the request (params, auth, etc)
		RestAssured.authentication = RestAssured.basic("admin", "csG0Tr=1xUM^");
		
		
		File file1 = new File("./src/test/resources/data1.json");
		
		RequestSpecification inputRequest1 = RestAssured
									.given()
									.contentType(ContentType.JSON)
									.body(file1)
									
									;
				   					

		
//		Step 4 - send the request(http methods)
		Response response1 = inputRequest1.post();
		
//		Step 5 - Validate the response
		response1.prettyPrint();
		
		
	File file2 = new File("./src/test/resources/data2.json");
		
		RequestSpecification inputRequest2 = RestAssured
									.given()
									.contentType(ContentType.JSON)
									.body(file2)
									
									;
				   					

		
//		Step 4 - send the request(http methods)
		Response response2 = inputRequest2.post();
		
//		Step 5 - Validate the response
		response2.prettyPrint();
		
		
		
File file3 = new File("./src/test/resources/data3.json");
		
		RequestSpecification inputRequest3 = RestAssured
									.given()
									.contentType(ContentType.JSON)
									.body(file3)
									
									;
				   					

		
//		Step 4 - send the request(http methods)
		Response response3 = inputRequest3.post();
		
//		Step 5 - Validate the response
		response3.prettyPrint();
		
		
	}

}
