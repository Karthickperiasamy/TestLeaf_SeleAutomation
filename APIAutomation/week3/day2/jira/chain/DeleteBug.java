package week3.day2.jira.chain;

import org.testng.annotations.Test;

public class DeleteBug extends BaseClassImpl{
	
	@Test(dependsOnMethods = { "week3.day2.jira.chain.EditBug.editBugTest"})
	public void deleteBugTest() {
		//https://dev125568.service-now.com/api/now/table/incident/asasasasasasa
		response = request.delete("issue/"+id);
		System.out.println(response.statusLine());
		response.then().assertThat().statusCode(204);
	}

}
