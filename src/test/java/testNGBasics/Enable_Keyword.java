package testNGBasics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable_Keyword {
	@Test(enabled = true)
	public void TC1()
	{
		Reporter.log("TC1",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("TC2",true);
		Assert.fail();
	}
}
