package restAssuredBDD;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	public static String GetFirstName() {
		
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("john"+generatedString);
		
	}
	
	public static String GetLastName()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(1);
				
				return ("kenedy"+generatedString);
	}
	
	public static String GetUserName()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		
		return ("john"+generatedString);
		
	}
	
	public static String GetPassword() {
		
		String generatedString =RandomStringUtils.randomAlphabetic(3);
		
		return("john"+generatedString);
	}
	
	public static String GetEmil() {
		String generatedString = RandomStringUtils.randomAlphanumeric(3);
		return(generatedString+"gmail.com");
	}
	
	public static String EmpName() {
		String generatedString = RandomStringUtils.randomAlphabetic(1);
		return ("khan"+generatedString);
		
	}
	
	public static String EmpSal() {
		
		String generatedstring = RandomStringUtils.randomNumeric(5);
		return(generatedstring);
	}
	public static String EmpAge() {
		String generateString =RandomStringUtils.randomNumeric(2);
		
		return (generateString);
	}
	
	
	
	
	
	
	
}
