package package_DDF_POM_TESTING_BASE_UTILITY_CLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookloginPage_3 {
	@FindBy(xpath="//span[text()='Log Out']") private WebElement logoutbtn;
	

public FacebookloginPage_3 (WebDriver driver) {
	PageFactory.initElements( driver,this);
}

    public void clickLogoutPagelogoutbtn() {
    	logoutbtn.click();
    }
    	
    }