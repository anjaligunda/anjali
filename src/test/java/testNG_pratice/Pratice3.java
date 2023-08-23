package testNG_pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pratice3 {
	@Test
	public void demo()
	{
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
	}

}
