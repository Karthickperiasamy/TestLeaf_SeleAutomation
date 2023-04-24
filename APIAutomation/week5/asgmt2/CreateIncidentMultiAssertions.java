package week5.asgmt2;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateIncidentMultiAssertions {
	
	
	@Test
	public void CreateInci() {

		
		RestAssured.baseURI = "https://dev146547.service-now.com/api/now/table/incident";
		
//		Step 3- construct the request (params, auth, etc)
		RestAssured.authentication = RestAssured.basic("admin", "csG0Tr=1xUM^");
		
		
		File file = new File("./src/test/resources/data1.json");
		
							RestAssured
									.given()
									.contentType(ContentType.JSON)
									.body(file)
									.post()
									.then().log().all()
									.assertThat()
							        .body("result.number", Matchers.startsWith("INC"))
							        .body("result.correlation_id", Matchers.notNullValue())
							        .log().ifError();
							
									
				   	

	
	}

}
