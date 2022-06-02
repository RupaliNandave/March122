package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Sample1 {
	
	@BeforeClass
	public void openBrowser() {
		//open browser
	}
	
	@BeforeMethod
	public void lognin() {
		//login
	}
	
	@Test
	public void verifyUsername1() {
	 //actual test case
	}
	@Test
	public void verifyUsername2(){
	
	}
	 @AfterMethod

		public void logout() {
		 
	 }
	 
      @AfterClass
      public void closeBrowser() {
    	  //driver.quit();
      }
      
}
