package testNG_pratice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void demo()
	{
		Reporter.log("hello this is testng", false);
	}
	@Test
	public void demo1()
	{
		Reporter.log("hello this is testng", true);
	}
	

}
