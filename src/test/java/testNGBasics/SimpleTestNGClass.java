package testNGBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleTestNGClass {
	@Test
	public void TestCase1() {
    	WebDriver d=new ChromeDriver();
    	d.get("https://www.google.com/");
    }
	@Test
	public void TestCase2() {
    	WebDriver d=new ChromeDriver();
    	d.get("https://www.facebook.com/");
    }
}
