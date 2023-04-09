package week3.day1;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetIncidentswithQueryParamsMultiple {
	
	
	@Test
	public void getInci() {
		
//		Step 1 - Requirements
		
		
		
//		Step 2 - Endpoint with resources
		
		RestAssured.baseURI = "https://dev146547.service-now.com/api/now/table/incident";
		
//		Step 3- construct the request (params, auth, etc)
		RestAssured.authentication = RestAssured.basic("admin", "csG0Tr=1xUM^");
		
		Map<String,String> queryMap = new HashMap<String,String>();
		queryMap.put("sysparm_fields", "sys_id,category");
		queryMap.put("category", "hardware");
		
		
		
		
		RequestSpecification inputRequest = RestAssured.given()
													   .queryParams(queryMap);
		
//		Step 4 - send the request(http methods)
		Response response = inputRequest.get();
		
//		Step 5 - Validate the response
		response.prettyPrint();
	}

}
