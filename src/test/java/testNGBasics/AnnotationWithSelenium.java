package testNGBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationWithSelenium {
	WebDriver driver;
	@BeforeTest
	public void pre() {
		 driver=new ChromeDriver();
	}
    @Test
    public void testcase() throws InterruptedException
    {
    	driver.get("https://www.google.com/");
    	Thread.sleep(3000);
    }
    @AfterTest
    public void post()
    {
    	driver.quit();
    }
}
