package restAssuredBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo4_Demo {
	
	@Test
	public void deleteEmployee() {
		
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		
		RestAssured.basePath="/delete/11493";
		
		Response response =
		
		given()
		
		.when()
			.delete()
		.then()
				.statusCode(200)
				.statusLine("HTTP/1.1 200 OK")
				.log().all()
				
		.extract().response();
		
	String JasonasString = response.asString();
	
	Assert.assertEquals(JasonasString.contains("successfully! deleted Records"),true);
	}
}
