package week3.day2.serviceNow.chain;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EditIncident extends BaseClassImpl{
	
	@Test(dependsOnMethods = { "week3.day2.serviceNow.chain.CreateIncident.createIncidentTest"})
	public void editIncidentTest() {
		//https://dev125568.service-now.com/api/now/table/incident/asasasasasasa
		RequestSpecification request = RestAssured.given().contentType(ContentType.JSON)
				.body("{\r\n"
						+ "  \"short_description\": \"Edit Incident\"\r\n"
						+ "}");
		
		response = request.put("incident/"+sys_id);
		System.out.println(response.statusLine());
		response.then().assertThat().statusCode(200);
	}

}
