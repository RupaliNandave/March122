package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Test_Class {
	
	@Test
	public void test() {
		//System.out.println("Quantum Academy");
		//Reporter.log("Quantum Academy", false);//msg will display in report but not in console
		//Reporter.log("Quantum Academy", true);//msg will display in report as well as in console
		Reporter.log("Quantum Academy");
		
	}

}
