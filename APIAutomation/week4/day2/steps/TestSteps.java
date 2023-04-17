package week4.day2.steps;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.hamcrest.Matchers;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestSteps {

	RequestSpecification request = null;
	Response response = null;
	 static String sys_id=null;

	@Given("set the endpoint")
	public void setEndpoint() {
		RestAssured.baseURI = "https://dev146547.service-now.com/api/now/table/incident";
	}

	@And("add the auth")
	public void addAuth() {
		RestAssured.authentication = RestAssured.basic("admin", "csG0Tr=1xUM^");
	}

	@When("send the request")
	public void sendRequest() {
		request = RestAssured.given().contentType(ContentType.JSON);
	//	response = request.get();
	}

	@Then("validate the response")
	public void validateResponse() {
		response.then().assertThat().statusCode(200);
	}

	@And("add the queryParams as {string} and {string}")
	public void setQueryParams(String key, String Value) {
		request = RestAssured.given().log().all().queryParam(key, Value).contentType(ContentType.JSON);

	}
	
	@When("send the post request")
	public void sendRequestPost() {
		response = RestAssured.given().contentType(ContentType.JSON).post();
	}

	@When("send the delete request")
	public void sendRequestDelete() {
		response = RestAssured.given().log().all().delete("/"+sys_id);
	}
	
	@When("send the put request")
	public void sendRequestPut() {
			response = RestAssured.given().log().all().contentType(ContentType.JSON).
					body("{\r\n"
							+ "  \"description\": \"1a23d4\"\r\n"
							+ "}").put("/"+sys_id);
			
	}
	
	
	@When("send the pre get request")
	public void sendPreRequest() {
		response = RestAssured.given().log().all().get("/"+sys_id);
		response.then().log().all();
//		 sys_id = response.jsonPath().get("result.sys_id");
		System.out.println(response.jsonPath().get("result.number"));
	}

	@When("send the post get request")
	public void sendPostRequest() {
		request = RestAssured.given().log().all();
		response = request.get("/"+sys_id);
		response.then().log().all();
		 
	}
	
	@When("send the request with QP")
	public void sendRequestwithQP() {
		response = request.get();
	}

	@And("add the queryParams")
	public void addqueryParams(DataTable dt) {
		Map<String, String> map_values = dt.asMap();
		request = RestAssured.given().log().all().queryParams(map_values);

	}

	@Then("validate the response for below")
	public void validateResposeStringForMulti(DataTable dt) {
		Map<String, String> asMap = dt.asMap();
		for (Entry<String, String> eachEntry : asMap.entrySet()) {

			response.then().body(eachEntry.getKey(), Matchers.equalTo(eachEntry.getValue()));
			
			

		}

	}

	@Then("validate the response as {int}")
	public void validateResposeInt(int code) {
		response.then().assertThat().statusCode(code);
	}
	
	@When("post the request with short description as {string} and category as {string}")
	public void postRequest(String short_desc, String category) {
		response = request.body("{\"short_description\":\"" + short_desc + "\",\"category\":\"" + category + "\"}")
				.post();
		sys_id = response.jsonPath().get("result.sys_id");
		
	}
				
	@Then("validate the response1 for below")
	public void validateRespose1StringForMulti(DataTable dt) {
		 List<Map<String, String>> asMaps = dt.asMaps();
			for (Map<String, String> eachEntry : asMaps) {

				response.then().log().all().body(eachEntry.get("key"), Matchers.not(eachEntry.get("value")));
				

			}

		}
		
		
		@Then("validate the response2 for below")
		public void validateRespose2StringForMulti(DataTable dt) {
			 List<Map<String, String>> asMaps = dt.asMaps();
				for (Map<String, String> eachEntry : asMaps) {

					response.then().log().all().body(eachEntry.get("key"), Matchers.not(eachEntry.get("value")));
					
					
				
				

			}

		}
		
		
		@Then("validate the response3 for below")
		public void validateRespose3StringForMulti(DataTable dt) {
			Map<String, String> asMap = dt.asMap();
			for (Entry<String, String> eachEntry : asMap.entrySet()) {

				response.then().log().all().body(eachEntry.getKey(), Matchers.notNullValue());
				
				

			}

		}
		
	
		@Then("validate the response4 for below")
		public void validateRespose4StringForMulti(DataTable dt) {
			 List<Map<String, String>> asMaps = dt.asMaps();
				for (Map<String, String> eachEntry : asMaps) {

					response.then().log().all().body(eachEntry.get("key"), Matchers.hasLength(10));
					
		
				}}
		
		
		
		@Then("validate the response5 for below")
		public void validateRespose5StringForMulti(DataTable dt) {
			 List<Map<String, String>> asMaps = dt.asMaps();
				for (Map<String, String> eachEntry : asMaps) {

					response.then().body(eachEntry.get("key"), Matchers.equalTo(eachEntry.get("value")));
					
		
				}}
		
		
		@Then("validate the response6 for below")
		public void validateRespose6StringForMulti(DataTable dt) {
			 List<Map<String, String>> asMaps = dt.asMaps();
				for (Map<String, String> eachEntry : asMaps) {

					response.then().log().all().body(eachEntry.get("key"), Matchers.startsWith(eachEntry.get("value")));
					
					
		
				}}
		
}
