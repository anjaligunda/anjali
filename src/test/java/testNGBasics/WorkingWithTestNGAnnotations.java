package testNGBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorkingWithTestNGAnnotations {
    @BeforeSuite
	public void t1() {
		System.out.println("i am before suite");
	}
    @BeforeTest
    public void t2() {
		System.out.println("i am before test");
	}
    @BeforeMethod
    public void t3() {
		System.out.println("i am before class");
	}
    @BeforeClass
    public void t4() {
		System.out.println("i am before method");
		
	}
    @Test
    public void test() {
		System.out.println("i am test");
    }
    @Test
    public void test1() {
		System.out.println("i am test1");
    }
    @AfterMethod
    public void t5() {
		System.out.println("i am after method");
		
	}
    @AfterClass
    public void t6() {
		System.out.println("i am after class");
		
	}
    @AfterTest
    public void t7() {
		System.out.println("i am afrer test");
		
	}
    @AfterSuite
    public void t8() {
		System.out.println("i am after suite");
		
	}
    
    
    
}
