package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Verificationon_Assertclass_disadvantage {
	
	//hard assert
	@Test
	public void test() {
		String actResult="good night";
		String expResult="good morning";
		boolean result=false;
		//verification1
		Assert.assertNotEquals(actResult, expResult, "Verification1:act and exp result is same");

		//verification2
				Assert.assertEquals(actResult, expResult,"Verification2:act and exp result is different");
				
	      //verification3
				Assert.assertTrue(result,"Verification3:result is false");
		
		//output= Verification2:act and exp result is different expected [good morning] but found [good night]
	
	}

}
