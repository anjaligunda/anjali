package testNGBasics;

import org.testng.Reporter;



public class Test {

	@org.testng.annotations.Test
	public void demo() {
		Reporter.log("hi",true);
	}
	
//	they are two type of printing stmts
//	Reporter.log("hi");-->it will print only in reports
//	Reporter.log("hi",true);-->it can printed in reports and console as well (mainly we use this)
//	Reporter--->it is a class
//	log()--->it is a static method in reporter class
	
//	THEY WERE TWO TYPES OF REPORTS IN TESTNG
//	*Emailable Report->it a report generated by tstNG ,by loooking it we can easliy undestand 
//	how many testcases were passed and how many testcases were failed 
//	
//	PASS->green fail->red
	
//	how to generate the emailable report
//	1)write the program using @test [create program under the user generated package]
//       and run the program
//    2)right click on that program->testng-->convert to testNG
//      (so that under our project testoutput folder will be created)
//	3)Right click on project and refresh it so that test output folder will be created under this project
//     4)Under test o/p folder emailable report will be genertated 
//         right click on emailable.html report will be generated

}


