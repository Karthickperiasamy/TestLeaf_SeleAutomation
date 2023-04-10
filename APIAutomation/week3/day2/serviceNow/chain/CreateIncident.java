package week3.day2.serviceNow.chain;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class CreateIncident extends BaseClassImpl{
	
	@Test
	public void createIncidentTest() {
		response = request.post("incident");
	
		//Assert.assertEquals(true, false);
		
		sys_id = response.jsonPath().get("result.sys_id");
		System.out.println("Sys_id=== "+sys_id);
		response.then().assertThat().statusCode(201);
//		throw new RuntimeException();
	}

}
