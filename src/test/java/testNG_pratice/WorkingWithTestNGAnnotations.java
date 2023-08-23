package testNG_pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class WorkingWithTestNGAnnotations {
     WebDriver driver;
     @BeforeSuite
     public void pre()
     {
    	 driver=new ChromeDriver();
     }
     @Test
     public void testcase() throws InterruptedException
     {
    	 driver.get("https://www.google.com/");
    	 driver.manage().window().maximize();
    	 Thread.sleep(2000);
    	 driver.switchTo().newWindow(WindowType.TAB);
    	 driver.get("https://www.facebook.com/");
    	 Thread.sleep(2000);
     }
     @AfterSuite
     public void post()
     {
    	 driver.close();
     }
     
}
