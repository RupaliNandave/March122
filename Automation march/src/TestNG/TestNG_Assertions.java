package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Assertions {
	
	//1.assertEqual
	/*@Test
	public void test() {
		Reporter.log("running test method",true);
		
		String expresult="good night";
		String actResult="good night";
		Assert.assertEquals(expresult, actResult,"act&exp results are different");
	
	}*/

	//2.assertNotEquals
	/*@Test
	public void test() {
		Reporter.log("running test method",true);
		
		String expresult="good night";
		String actResult="good night123";
		Assert.assertNotEquals(actResult, expresult,"act&exp results are same");
	
	}*/
	
	//3.Assert true
	
	/*@Test
	public void test() {
		Reporter.log("running test method",true);
		boolean result = true;
		
		Assert.assertTrue(result, "result is false");
	}}
	*/
     //4.Assert false

       /*@Test
       public void test() {
	Reporter.log("running test method",true);
	boolean result = false;
	
	Assert.assertFalse(result, "result is true");
}*/

      //5.AssertNull
      @Test
      public void test1() {
	  Reporter.log("running test1 method",true);
		 String result = null;
		
		Assert.assertNull(result, "result is not null");
	  
  }

      //6.AssertNotNull
       @Test
       public void test2() {
	    Reporter.log("running test2 method",true);
		 String result = "QA";
		
		Assert.assertNotNull(result, "result is null");
	  
}
            //7.fail
            public void test3() {
	        Reporter.log("running test3 method",true);
		     Assert.fail();
}}
		
	
	
	
	
	

