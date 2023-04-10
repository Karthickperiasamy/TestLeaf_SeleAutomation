package week3.day2.jira.chain;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class EditBug extends BaseClassImpl{
	
	@Test(dependsOnMethods = { "week3.day2.jira.chain.CreateBug.createBugTest"})
	public void editBugTest() {
		//https://dev125568.service-now.com/api/now/table/incident/asasasasasasa
		RequestSpecification request = RestAssured.given().contentType(ContentType.JSON)
				.body("{\r\n"
						+ "  \"fields\": {\r\n"
						+ "    \"description\": \"Bug creation Using REST API for testing\"\r\n"
						+ "  }\r\n"
						+ "}");
		
		response = request.put("issue/"+id);
		System.out.println(response.statusLine());
		response.then().assertThat().statusCode(204);
	}

}
