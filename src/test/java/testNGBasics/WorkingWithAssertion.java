package testNGBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WorkingWithAssertion {
	@Test
	public void t1() {
		int a=10;
		int b=20;
		Assert.assertEquals(a, b);//this line will works first paramater is actual and second is expected
	                             //if both are same it will consider as testcase pass or else fail
	
	}
	@Test(description = "validate the title")
	public void t2() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		String exptTilte="Google";
		String actualTitle=d.getTitle();
		Assert.assertEquals(actualTitle, exptTilte);
	}
	
	
	
	

}
