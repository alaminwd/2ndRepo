package restAssuredBDD;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;

public class Demo6_BasicValidation_Xml {

	@Test(priority=1)
	
	public void TestSingleContent()
	{
		given()
		
		.when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
			
		.then()
		
			.body("CUSTOMER.ID",equalTo("15"))
			.log().all();
		
	}
	
@Test(priority=2)
	
	public void TestMultipleContent()
	{
		given()
		
		.when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
			
		.then()
		
			.body("CUSTOMER.ID",equalTo("15"))
			.body("CUSTOMER.FIRSTNAME",equalTo("Bill"))
			.body("CUSTOMER.LASTNAME",equalTo("Clancy"))
			.body("CUSTOMER.STREET",equalTo("319 Upland Pl."))
			.body("CUSTOMER.CITY",equalTo("Seattle"));
		
	}

@Test(priority=3)
public void ContentInOneGo()
{
	given()
	
	.when()
		.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		
	.then()
	
		.body("CUSTOMER.text()",equalTo("15BillClancy319 Upland Pl.Seattle"));
	
}

	@Test(priority=4)
	public void TestUsingXpath() {
		
		given()
		
		.when()
			.get("http://thomas-bayer.com/sqlrest/CUSTOMER/15/")
		.then()
			.body(hasXPath("/CUSTOMER/FIRSTNAME",containsString("Bill")));
		
	}
	
	@Test(priority=5)
public void TestUsingXpath2() {
		
		given()
		
		.when()
			.get("http://thomas-bayer.com/sqlrest/INVOICE")
		.then()
			//.body(hasXPath("/INVOICEList/INVOICE[text()='30']"));
		.body(hasXPath("/INVOICEList/INVOICE[text()='30']"));
		
	}
	


}
