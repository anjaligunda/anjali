package testNG_pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Pratice1 {
    @Test(priority = -4)
	public void name() {
	WebDriver d=new ChromeDriver();
	d.get("https://www.google.com/");
}
    @Test(priority = 4)
   public void name1() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
	}
    @Test(priority = 0)
   public void name2() {
		WebDriver d=new EdgeDriver();
		d.get("https://www.instagram.com/");
	}
    @Test(priority = -7)
   public void name3() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.amazon.com/");
	}
}
