package package_DDF_POM_TESTING_BASE_UTILITY_CLASS;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookloginTest extends BaseClass {
	
	FacebookLoginPage1 login1;
	Facebook_HomePage login2;
	FacebookloginPage_3 logout;
	
	@BeforeClass
	public void openBrowser() throws IOException {
		browserOpen();
		login1=new FacebookLoginPage1(driver);
		login2=new Facebook_HomePage(driver);
		logout=new FacebookloginPage_3(driver);
		
	}
  @BeforeMethod
  public void login() throws EncryptedDocumentException, IOException {
	  login1.setFaceBookLoginUsername(UtilityClass.getTestData(0, 0)) ; 
	  login1.setFacebookLoginPassword(UtilityClass.getTestData(0, 1));
	  login1.clickFacebookLoginbtn();
	  login2.verifyFacebookHomePagePRofileName();
	  logout.clickLogoutPagelogoutbtn();
  }
	  
	 
	 
	  
	  
	  @Test
	 public void test() throws EncryptedDocumentException, IOException {
		  String expResult=UtilityClass.getTestData(0, 3);
		  String actResult=login2.verifyFacebookHomePagePRofileName();
		   Assert.assertEquals(actResult, expResult,"act&exp result is different");
	  }
		  
	  
	  @AfterMethod
	  public void login2(ITestResult result) throws IOException {
		  if(result.getStatus()==ITestResult.FAILURE) {
			  int TCID=200;
			  UtilityClass.captureScreenshot(driver, TCID);
		  }
		  logout.clickLogoutPagelogoutbtn();
	  }
	  @AfterClass
	  public void closeBrowser() {
		  driver.quit();
		 
	  }
	  
	  
	  
  }


