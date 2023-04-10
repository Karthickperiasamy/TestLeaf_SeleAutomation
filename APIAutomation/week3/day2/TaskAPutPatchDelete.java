package week3.day2;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TaskAPutPatchDelete {

	@Test
	public void put() {
		RestAssured.baseURI = "https://dev146547.service-now.com/api/now/table/change_request/d40ddf56470a6110348c0bdbd36d43ef";

		RestAssured.authentication = RestAssured.basic("admin", "csG0Tr=1xUM^");

		RequestSpecification inputRequest = RestAssured.given().contentType(ContentType.JSON)
				.body("{\r\n"
						+ "  \"short_description\": \"using put method for hamcrest\"\r\n"
						+ "}");

		Response response = inputRequest.put();
		//response.then().log().all();

		//response.prettyPrint();
		response.then().assertThat().statusCode(200);
		
	}
	
	@Test
	public void patch() {
		RestAssured.baseURI = "https://dev146547.service-now.com/api/now/table/change_request/d40ddf56470a6110348c0bdbd36d43ef";

		RestAssured.authentication = RestAssured.basic("admin", "csG0Tr=1xUM^");

		RequestSpecification inputRequest = RestAssured.given().contentType(ContentType.JSON)
				.body("{\r\n"
						+ "  \"short_description\": \"using patch method for hamcrest\"\r\n"
						+ "}");

		Response response = inputRequest.patch();
		
		response.then().assertThat()
		.body("result.short_description", Matchers.containsString("hamcrest"))
		.body("result.number", Matchers.equalTo("CHG0030001"))
		.statusCode(200);


		//response.prettyPrint();
		
		
	}
	
	@Test
	public void delete() {
		RestAssured.baseURI = "https://dev146547.service-now.com/api/now/table/change_request/d40ddf56470a6110348c0bdbd36d43ef";

		RestAssured.authentication = RestAssured.basic("admin", "csG0Tr=1xUM^");

		RequestSpecification inputRequest = RestAssured.given();
		Response response = inputRequest.delete();

		//response.prettyPrint();
		
		response.then().assertThat().statusLine("HTTP/1.1 204 No content");

	}

}