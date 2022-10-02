package sampletestcases;

import org.apache.poi.util.SystemOutLogger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {

	@Test
	public void verifyloginWithValidCredentials() {
		
		System.out.println("Test starting ... ");
		System.out.println("verifyloginWithValidCredentials");
		Assert.assertTrue(true);
		System.out.println("Test Ended..");
	}
	
	
	@Test
	public void verifyloginWithInValidCredentials() {
		
		System.out.println("Test starting ... ");
		System.out.println("verifyloginWithInValidCredentials");
		Assert.assertTrue(true);
		System.out.println("Test Ended..");
	}
	
	@Test
	public void verifyloginWithNoCredentials() {
		
		System.out.println("Test starting ... ");
		System.out.println("verifyloginWithNoCredentials");
		Assert.assertTrue(true);
		System.out.println("Test Ended..");
	}
	
}
