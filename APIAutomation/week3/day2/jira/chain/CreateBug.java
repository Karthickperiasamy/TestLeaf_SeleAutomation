package week3.day2.jira.chain;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class CreateBug extends BaseClassImpl{
	
	@Test
	public void createBugTest() {
		
		RequestSpecification request = RestAssured.given().contentType(ContentType.JSON)
				.body("{\r\n"
						+ "  \"fields\": {\r\n"
						+ "    \"project\": {\r\n"
						+ "      \"key\": \"KR\"\r\n"
						+ "    },\r\n"
						+ "    \"summary\": \"create issue in RA project\",\r\n"
						+ "    \"description\": \"Creating of an issue using project keys and issue type names using the REST API\",\r\n"
						+ "    \"issuetype\": {\r\n"
						+ "      \"name\": \"Bug\"\r\n"
						+ "    }\r\n"
						+ "  }\r\n"
						+ "}");
		response = request.post("issue/");
	
		
		//Assert.assertEquals(true, false);
		
		id = response.jsonPath().get("id");
		System.out.println("id=== "+id);
		response.then().assertThat().statusCode(201);
//		throw new RuntimeException();.
	}

}
