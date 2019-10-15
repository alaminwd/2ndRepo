package restAssuredBDD;

import java.util.HashMap;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demo2_post_Request {

	public static HashMap map = new HashMap();
	
	@BeforeClass
	public void postdata()
	{
		map.put("FirstName",RestUtils.GetFirstName());
		map.put("LastName",RestUtils.GetLastName());
		map.put("UserName",RestUtils.GetUserName());
		map.put("Password",RestUtils.GetPassword());
		map.put("Email",RestUtils.GetEmil());
		
		RestAssured.baseURI="http://restapi.demoqa.com/customer";
		RestAssured.basePath="/register";
		
	}
	
	@Test
	public void testPost()
	{
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.post()
			
		  
		.then()
		
			.statusCode(201)
			.body("SuccessCode",equalTo("OPERATION_SUCCESS"))
			.body("Message",equalTo("Operation completed successfully"));
		
	}
}
