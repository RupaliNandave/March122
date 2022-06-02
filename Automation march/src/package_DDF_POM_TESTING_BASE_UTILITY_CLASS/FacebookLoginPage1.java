package package_DDF_POM_TESTING_BASE_UTILITY_CLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage1 {
	
	@FindBy(xpath="//input[@name='email']") private WebElement UN;
	@FindBy(xpath="//input[@name='pass']") private WebElement PWD;
	
	@FindBy(xpath="//button[@name='login']") private WebElement LoginBtn;
	
	public FacebookLoginPage1(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void setFaceBookLoginUsername(String username) {
		UN.sendKeys("username");
	}
     public void setFacebookLoginPassword(String password) {
    	 PWD.sendKeys("password");
     }
     public void clickFacebookLoginbtn() {
    	 LoginBtn.click();
     }
}


