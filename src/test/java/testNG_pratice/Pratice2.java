package testNG_pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pratice2 {
    @Test(priority = 1)
	public void name() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
	}
    @Test(description = "this is facebook",enabled = false)
    public void name2() {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
	}

}
