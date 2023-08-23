package testNGBasics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion_Methods {
	@Test
	public void demo()
	{
		String exp="hi";
		String act="hi";
		Assert.assertEquals(exp, act,"Test case is passed");
	}

}
