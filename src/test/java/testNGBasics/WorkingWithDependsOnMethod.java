package testNGBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkingWithDependsOnMethod {
	@Test(priority = 1)
	public void start() {
		System.out.println("start");
		
	}
	@Test(priority = 2)
	public void login() {
		String expected_pass="Test@123";
		String Actual_pass="Tst@123";
		
		Assert.assertEquals(Actual_pass, expected_pass);
		
	}
	@Test(priority = 3,dependsOnMethods = "login")
	public void profile() {
		System.out.println("login sucessfully");
	}
	@Test(priority = 4)
	public void end() {
		System.out.println("end");
	}

}
