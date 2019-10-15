package restAssuredBDD;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

/*
 * 1)Test Status Code
 * 2)Log Response
 * 3)Varify Single content in Response body 
 * 4)varify Multy content in response body 
 * 5)Setting parameters and headers 
 */
public class Demo5_Basic_validation_JSON {

	//Test Status Code
	@Test(priority =1)
	public void testStutuscode() {
		
		given()
		
		.when()
			.get("http://jsonplaceholder.typicode.com/posts/5")
		.then()
			.statusCode(200);
	}
	
	@Test(priority=2)
	
	public void Testlogging() {
		
		given()
		
		.when()
			.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
			
		.then()
		.statusCode(200)
		.log().all();
		
	}
	
	@Test(priority=3)
	public void testSingleContent() {
		
		given()
		
		.when()
		.get("http://restapi.demoqa.com/utilities/weather/city/Hyderabad")
		
		.then()
		
		.statusCode(200)
		.body("City",equalTo("Hyderabad"));
	}
	
	@Test(priority=4)
	public void testMultipleContent() {
		
		given()
		
		.when()
			.get("https://restcountries.eu/rest/v2/all")
		
		.then()
		
		.statusCode(200)
		.body("name",hasItems("Afghanistan","Bhutan","Bosnia and Herzegovina"));
	}
	
	
}
