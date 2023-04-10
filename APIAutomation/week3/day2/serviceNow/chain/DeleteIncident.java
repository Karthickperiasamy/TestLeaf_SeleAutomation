package week3.day2.serviceNow.chain;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DeleteIncident extends BaseClassImpl{
	
	@Test(dependsOnMethods = { "week3.day2.serviceNow.chain.EditIncident.editIncidentTest"})
	public void deleteIncidentTest() {
		//https://dev125568.service-now.com/api/now/table/incident/asasasasasasa
		response = request.delete("incident/"+sys_id);
		System.out.println(response.statusLine());
		response.then().assertThat().statusCode(204);
	}

}
