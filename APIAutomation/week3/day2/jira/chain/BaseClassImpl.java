package week3.day2.jira.chain;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseClassImpl {
	
	static RequestSpecification request=null;
	 static String id=null;
	 static Response response=null;
	
	@BeforeMethod
	public void setup() {
		
		RestAssured.baseURI = "https://marbatchapi.atlassian.net/rest/api/2/";
		RestAssured.authentication = RestAssured.preemptive().basic("karthickkumarrp@gmail.com",
				"ATATT3xFfGF0pQPVmCMGj9hLNmawrXcTnNJW5y8l8Gc4tQhm1NNR84LL2CNrJYGu-NAFkKqSarGCkNgJp4S-bHet28EX-e2yTEYG9d-veKIvxyvbz3PECGejNpofvdgP9MyBjmNH0SGlkwMVOVKslrNBquQKR7UYMI9L0Y-DWwdMqQ-PiJosbCE=FF69F931");
		
		request = RestAssured.given().contentType(ContentType.JSON).log().all();

	}
	
	@AfterMethod
	public void tearDown() {
		response.then().log().all();
	}

}
