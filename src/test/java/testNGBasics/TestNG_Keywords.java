package testNGBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keywords {
//  TestNG keywords: keywords are used in TestNG to avoid/ to reduce the length of script
//  ->it is also called as TESTNG flags
//  
//  1)invocationcount:->sometimes we have to run sometest case for multiple times in this situtaion we use this 
      @Test(invocationCount = 10)
      public void demo()
      {
    	  Reporter.log("hi ",true);
      }





}
