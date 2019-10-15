package restAssuredBDD;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Demo3_Put_Request {
	public static HashMap map1= new HashMap();
	
	@BeforeTest
	public void putData() {
		map1.put("name",RestUtils.EmpName());
		map1.put("salary",RestUtils.EmpSal());
		map1.put("age",RestUtils.EmpAge());
		
		int Emp_ID=11501;
		
		
		RestAssured.baseURI="http://dummy.restapiexample.com/api/v1";
		
		RestAssured.basePath="/update/"+Emp_ID;
		
	}
	
	@Test
	
	public void testPut() {
		
		given()
		
			.contentType("application/json")
			
			.body(map1)
		
		.when()
		
			.put()
		
		.then()
		
		.statusCode(200)
		.log().all();
		
		
		
		
	}
	
	
	
	
	
	
	

}
