package testNGBasics;

import org.testng.annotations.Test;

public class Intro {
    @Test (priority = 5,description = "validate def",enabled = true)//here priority,desc means attribute
	public void def()
	{
		System.out.println("i am def");
	}
    @Test (priority = 2,description = "validate abc",enabled = true)
	public void abc()
	{
		System.out.println("i am abc");
	}
    @Test (priority = -3,description = "validate xyz",enabled = true)
	public void xyz()
	{
		System.out.println("i am xyz");
		
	}
    @Test (priority = 5,description = "validate klm",enabled = false)
	public void klm()
	{
		System.out.println("i am klm");
	}
    
    
    //generally it will excute in alphabetical order if we have multiple test annotations(i.e,@Test )
    //priority isthe manam ichina order lo excute avuthai
    //here desc will be whether testcase is passed or not 
    //here "enabled = true" it say wheather to excute or not (if enabled false means testcase will be ignored)
}
