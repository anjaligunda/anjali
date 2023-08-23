package testNG_pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkingWithAssertion {

	@Test(description = "facebook webpage ")
	public void test()
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		String actual=d.getTitle();
		String exp="Facebook � log in or sign up";
		Assert.assertEquals(actual, exp);
	}
}
