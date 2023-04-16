package week4.day1.steps;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestSteps {
	
	RequestSpecification request = null;
	Response response = null;
	
	
	@Given("set the endpoint")
	public void setEndpoint() {
		RestAssured.baseURI = "https://dev125568.service-now.com/api/now/table/incident";
	}
	
	@And("add the auth")
	public void addAuth() {
		RestAssured.authentication = RestAssured.basic("admin", "jM@5Rfg3Ht$V");
	}
	
	@When("send the request")
	public void sendRequest() {
		request = RestAssured.given().log().all();
		response = request.get();
	}
	
	@Then("validate the response")
	public void validateResponse() {
		response.then().log().all().assertThat().statusCode(200);
	}
	
	@And("add the queryParams as {string} and {string}")
	public void setQueryParams(String key, String Value) {
		request = RestAssured.given().log().all().queryParam(key, Value);
		
	}
	
	@When("send the request with QP")
	public void sendRequestwithQP() {
		response = request.get();
	}
	
	@And("add the queryParams")
	public void addqueryParams(DataTable dt) {
		Map<String,String> map_values = dt.asMap();
		request = RestAssured.given().log().all().queryParams(map_values);	
	
	

}
	
}