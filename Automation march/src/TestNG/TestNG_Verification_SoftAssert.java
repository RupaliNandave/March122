package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG_Verification_SoftAssert {
	
	@Test
	public void test() {
		String actResult="good night";
		String expResult="good morning";
		boolean result=false;
    
		SoftAssert soft=new SoftAssert();
		
		//Verification1
		soft.assertNotEquals(actResult, expResult,"Verification1:act&exp result is same");
		//Verification2
				soft.assertEquals(actResult, expResult,"Verification2:act&exp result is different");
				
				//Verification3
				soft.assertTrue(result,"result is false");
				
				soft.assertAll();
				
				//output==The following asserts failed:
				//Verification2:act&exp result is different expected [good morning] but found [good night],
				// Verification3:result is false expected [true] but found [false]

}}
